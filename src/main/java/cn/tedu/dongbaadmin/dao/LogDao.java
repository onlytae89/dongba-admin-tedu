package cn.tedu.dongbaadmin.dao;

import cn.tedu.dongbaadmin.entity.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LogDao {

    /**
     * 统计某个用户的日志总数
     * @param username 用户名，支持模糊查询，可为null
     * @return 该用户的日志数量
     */
    int countByUsername(@Param("username") String username);

    /**
     * 按页查询某个用户的日志
     * @param username 用户名，支持模糊查询，可为null
     * @param startIndex sql limit 语句的开始索引，从0开始
     * @param pageSize 每页记录数
     * @return 当前页的日志列表
     */
    List<Log> findByUsernameOrderByCreatedTimeLimit(@Param("username") String username,
                                                    @Param("startIndex") Integer startIndex,
                                                    @Param("pageSize") Integer pageSize);

}
