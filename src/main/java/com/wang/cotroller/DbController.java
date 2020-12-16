package com.wang.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.wang.bean.OffClassMonitor;
import com.wang.bean.Page;
import com.wang.service.OffClassMonitorService;

@RestController
public class DbController {
	
	@Autowired
	private OffClassMonitorService offClassMonitorService;
	
	@GetMapping("getDataList")
	public String getDataList() {
		List<OffClassMonitor>list = offClassMonitorService.getOffClassInfoListByCondition(new OffClassMonitor());
		return JSON.toJSONString(list);
	}
	
	@GetMapping("getDataPage")
	public String getDataPage() {
		Page<OffClassMonitor> pageInfo = offClassMonitorService.queryPageByHandleState(1,2,new OffClassMonitor());
		return JSON.toJSONString(pageInfo);
	}
	
}
