package com.wang.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.wang.bean.OffClassMonitor;
import com.wang.bean.Page;

@Mapper
public interface OffClassMonitorDao {

    int insert(OffClassMonitor record);

    int updateByPrimaryKeySelective(OffClassMonitor record);

    List<OffClassMonitor> selectByStuAndClass(OffClassMonitor record);

    List<OffClassMonitor> selectByCondition(OffClassMonitor record);
    
    List<OffClassMonitor> selectPageByCondition(OffClassMonitor record,Page<OffClassMonitor> page);

    OffClassMonitor selectByPrimaryKey(Integer id);
    
    List<Map<String,String>> getAllDeptInfo();
    
    List<Map<String,String>> getAllSubjectByDept(String deptCode);
}
