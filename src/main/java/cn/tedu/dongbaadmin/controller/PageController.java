package cn.tedu.dongbaadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /**返回首页页面*/
    @RequestMapping("doIndexUI")
    public String doIndexUI() {
        return "starter";
    }
    /**返回分页页面*/
    @RequestMapping("doPageUI")
    public String doPageUI() {
        return "common/page";
    }
    /**返回日志列表页面*/
    @RequestMapping("log/log_list")
    public String doLogUI() {
        return "sys/log_list";
    }

}
