package com.wang.service;

import java.util.List;

import com.wang.bean.OffClassMonitor;
import com.wang.bean.Page;

public interface OffClassMonitorService {
    /**
     * 重写 查询退班列表页（含分页） 方法
     * @param pageNum
     * @param pageSize
     * @param offClassMonitor
     * @return
     */
    Page<OffClassMonitor> queryPageByHandleState(Integer pageNum,Integer pageSize,OffClassMonitor offClassMonitor);
    
    /**
     * 重写 根据条件查询监听跟进数据列表 方法
     * @param offClassMonitor
     * @return
     */
    List<OffClassMonitor> getOffClassInfoListByCondition(OffClassMonitor offClassMonitor);
    
    void printData(String name);
}
