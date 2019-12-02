package cn.tedu.dongbaadmin.controller;

import cn.tedu.dongbaadmin.common.vo.JsonResult;
import cn.tedu.dongbaadmin.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/doFindPageObjects")
    public JsonResult getLogPage() {
        return new JsonResult();
    }

    @PostMapping("/doDeleteObjects")
    public JsonResult deleteLogs() {
        return new JsonResult();
    }

}
