package cn.tedu.dongbaadmin.service;

import cn.tedu.dongbaadmin.common.vo.Page;
import cn.tedu.dongbaadmin.entity.Log;

public interface LogService {

    Page<Log> getLogPage(String username, Integer pageCurrent);

}
