package cn.tedu.dongbaadmin.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Log implements Serializable {

    /**此id为序列化唯一标识,尤其在反序列化时,
     * 对此id的要求就会更严格*/
    private static final long serialVersionUID = 1L;

    private Integer id;

    /**              用户名, 用户操作, 请求方法, 请求参数, IP地址 */
    private String username, operation, method, params, ip;

    /** 执行耗时(毫秒) */
    private Long time;

    /** 日志生成时间 */
    private LocalDateTime createdTime;

}