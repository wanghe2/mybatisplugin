package com.wang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.ano.SelfAnnotation;
import com.wang.bean.OffClassMonitor;
import com.wang.bean.Page;
import com.wang.dao.OffClassMonitorDao;
import com.wang.service.OffClassMonitorService;
@Service
@SelfAnnotation(value="offclassserviceimpl",type="class",args="pagenum=1,pagesize=20")
public class OffClassMonitorServiceImpl implements OffClassMonitorService{
	
	private String name = "hello";
	
	@Autowired
	private OffClassMonitorDao offClassMonitorDao;
	
	@SuppressWarnings("unused")
	private void fun1() {
		System.err.println(this.name);
	}
	
	
	@Override
	public Page<OffClassMonitor> queryPageByHandleState(Integer pageNum, Integer pageSize,
			OffClassMonitor offClassMonitor) {
		Page<OffClassMonitor> page = new Page<OffClassMonitor>();
		page.setpageNum(pageNum).setPageSize(pageSize);
		List<OffClassMonitor> classMonitors = offClassMonitorDao.selectPageByCondition(offClassMonitor,page);
		page.setResult(classMonitors);
		return page;
	}

	@Override
	public List<OffClassMonitor> getOffClassInfoListByCondition(OffClassMonitor offClassMonitor) {
		offClassMonitor.setBillCode("%Q%");
		offClassMonitor.setClassCode("%Z%");
		return offClassMonitorDao.selectByCondition(offClassMonitor);
	}

	@Override
	public void printData(String name) {
		System.err.println("*************************");
		System.err.println("*                       *");
		System.err.println("*                       *");
		System.err.println("*         "+name+"      *");
		System.err.println("*                       *");
		System.err.println("*                       *");
		System.err.println("*************************");
	}

	
}
