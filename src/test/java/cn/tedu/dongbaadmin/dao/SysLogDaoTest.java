package cn.tedu.dongbaadmin.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysLogDaoTest {

    @Autowired
    private SysLogDao sysLogDao;

    @Test
    void getRowCount() {
        assertTrue(sysLogDao.getRowCount("dmi") > 1); // admin
        assertTrue(sysLogDao.getRowCount(null) > 1);
        assertEquals(0, sysLogDao.getRowCount("!#@%><?"));
    }

    @Test
    void findPageObjects() {
        assertFalse(sysLogDao.findPageObjects("dmi", 0, 5).isEmpty());
        assertFalse(sysLogDao.findPageObjects(null, 0, 5).isEmpty());
        // 只会返回空List， 不会返回null
        assertTrue(sysLogDao.findPageObjects(null, 100_0000, 5).isEmpty());
        assertNotNull(sysLogDao.findPageObjects(null, 100_0000, 5));
        assertNotNull(sysLogDao.findPageObjects("!#@%><?", 100_0000, 5));

        assertTrue(
            sysLogDao
                .findPageObjects("dmi", 0, 5)
                .stream()
                .noneMatch(log -> (log.getId() == null || log.getId() < 1))
        );
    }
}