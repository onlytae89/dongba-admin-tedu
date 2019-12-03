package cn.tedu.dongbaadmin.service.impl;

import cn.tedu.dongbaadmin.common.vo.Page;
import cn.tedu.dongbaadmin.dao.LogDao;
import cn.tedu.dongbaadmin.entity.Log;
import cn.tedu.dongbaadmin.exception.ServiceException;
import cn.tedu.dongbaadmin.service.LogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    private final LogDao logDao;

    public LogServiceImpl(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public Page<Log> getLogPage(String username, Integer pageCurrent) {
        //1.验证参数合法性
        //1.1验证pageCurrent的合法性，
        //不合法抛出IllegalArgumentException异常
        if(pageCurrent==null||pageCurrent<1)
            throw new IllegalArgumentException("当前页码不正确");
        //2.基于条件查询总记录数
        //2.1) 执行查询
        int rowCount=logDao.countByUsername(username);
        //2.2) 验证查询结果，假如结果为0不再执行如下操作
        if(rowCount==0)
            throw new ServiceException("系统没有查到对应记录");
        //3.基于条件查询当前页记录(pageSize定义为2)
        //3.1)定义pageSize
        int pageSize=2;
        //3.2)计算startIndex
        int startIndex=(pageCurrent-1)*pageSize;
        //3.3)执行当前数据的查询操作
        List<Log> records=
            logDao.findByUsernameOrderByCreatedTimeLimit(username, startIndex, pageSize);
        //4.对分页信息以及当前页记录进行封装
        //4.1)构建PageObject对象
        //5.返回封装结果。
        return new Page<>(pageCurrent, pageSize, rowCount, records);
    }
}
