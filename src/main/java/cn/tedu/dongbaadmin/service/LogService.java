package cn.tedu.dongbaadmin.service;

import cn.tedu.dongbaadmin.common.vo.PageObject;
import cn.tedu.dongbaadmin.entity.Log;

public interface LogService {

    PageObject<Log> findPageObjects(String username, Integer pageCurrent);

}
