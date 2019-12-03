package cn.tedu.dongbaadmin.service;

import cn.tedu.dongbaadmin.exception.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SysLogServiceTest {

    @Autowired
    private SysLogService sysLogService;

    @Test
    void findPageObjects() {
        assertThrows( ServiceException.class, () -> sysLogService.findPageObjects("@#%@><",1) );
        assertThrows( IllegalArgumentException.class, () -> sysLogService.findPageObjects("admin",null) );
        assertTrue( sysLogService.findPageObjects("admin",1).getRowCount()>0 );
    }
}