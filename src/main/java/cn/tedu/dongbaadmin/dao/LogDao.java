package cn.tedu.dongbaadmin.dao;

import cn.tedu.dongbaadmin.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysLogDao {

    /**
     * 统计某个用户的日志总数
     * @param username 用户名，支持模糊查询，可为null
     * @return 该用户的日志数量
     */
    int getRowCount(@Param("username") String username);

    /**
     * 按页查询某个用户的日志
     * @param username 用户名，支持模糊查询，可为null
     * @param startIndex 页数，从1开始
     * @param pageSize 每页记录数
     * @return 当前页的日志列表
     */
    List<SysLog> findPageObjects(@Param("username") String username,
                                 @Param("startIndex") Integer startIndex,
                                 @Param("pageSize") Integer pageSize);

}
