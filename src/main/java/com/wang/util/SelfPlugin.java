package com.wang.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import com.wang.bean.Page;

/**
 * 自定义 mybatis的查询拦截器
 * @author Administrator
 *
 */
@Component

@Intercepts( { @Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class,Integer.class}) })
public class SelfPlugin implements Interceptor{

	@SuppressWarnings("rawtypes")
	@Override
	public Object intercept(Invocation invocation) throws Throwable {

		System.err.println("*******mybatis拦截*******");
		 // 该方法写入自己的逻辑
        if (invocation.getTarget() instanceof RoutingStatementHandler) {
        	RoutingStatementHandler statementHandler = (RoutingStatementHandler) invocation.getTarget(); 
        	BoundSql boundSql = statementHandler.getBoundSql();
        	String sql = boundSql.getSql();
        	System.err.println(sql);
        	Object obj = boundSql.getParameterObject();
        	if(sql.trim().startsWith("select") && obj instanceof ParamMap) {
        		System.err.println(obj);
        		ParamMap<?>paramMap = (ParamMap) obj;
        		Page page = null;
        		for(Entry entry : paramMap.entrySet()) {
        			System.err.println(entry.getKey() +" : "+entry.getValue());
        			if(entry.getValue() instanceof Page) {
        				page = (Page) entry.getValue();
        				break;
        			}
        		}
        		if(page != null) {//此时已获得传入的对象（这里 将sql的总条数查出来，赋值给page对象）
        			try {
        				PreparedStatement countStmt = null;
        				ResultSet rs = null;
	        			Connection connection = (Connection) invocation.getArgs()[0];
	        			String countSql = "select count(1) from (" + sql
								+ ") tmp_count"; // 记录统计
						countStmt = connection.prepareStatement(countSql);
					
						rs = countStmt.executeQuery();
						int count = 0;
						if (rs.next()) {
							count = ((Number) rs.getObject(1)).intValue();
						}
						page.setTotal(count);
	        			
        			}catch (Exception e) {
						e.printStackTrace();
					}
        		}
        		
        		//要改写sql查询语句，实现分页（limit start , size）
        		int start = (page.getPageNum()-1) * page.getPageSize();
        		sql += " limit "+start+","+page.getPageSize();
        		//利用反射强制写回boundsql对象
        		Field sqlField = boundSql.getClass().getDeclaredField("sql");
        		sqlField.setAccessible(true);
        		sqlField.set(boundSql, sql);
        		sqlField.setAccessible(false);//还原成私有属性
        	}
        }
        return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target,this);
	}

	@Override
	public void setProperties(Properties properties) {
		
	}

}
