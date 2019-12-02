package cn.tedu.dongbaadmin.service.impl;

import cn.tedu.dongbaadmin.dao.SysLogDao;
import cn.tedu.dongbaadmin.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

}
