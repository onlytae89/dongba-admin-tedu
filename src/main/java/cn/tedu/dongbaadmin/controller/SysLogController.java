package cn.tedu.dongbaadmin.controller;

import cn.tedu.dongbaadmin.common.vo.JsonResult;
import cn.tedu.dongbaadmin.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/doFindPageObjects")
    public JsonResult doFindPageObjects() {
        return new JsonResult();
    }

    @PostMapping("/doDeleteObjects")
    public JsonResult doDeleteObjects() {
        return new JsonResult();
    }

}
