package cn.tedu.dongbaadmin.service.impl;

import cn.tedu.dongbaadmin.dao.LogDao;
import cn.tedu.dongbaadmin.service.LogService;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    private final LogDao logDao;

    public LogServiceImpl(LogDao logDao) {
        this.logDao = logDao;
    }
}
