package cn.tedu.dongbaadmin.service;

import cn.tedu.dongbaadmin.common.vo.PageObject;
import cn.tedu.dongbaadmin.entity.SysLog;

public interface SysLogService {

    PageObject<SysLog> findPageObjects(String username, Integer pageCurrent);

}
