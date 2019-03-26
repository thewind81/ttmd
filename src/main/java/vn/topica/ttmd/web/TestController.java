package vn.topica.ttmd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.topica.ttmd.bo.Test;
import vn.topica.ttmd.service.TestService;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public Test test() {
        return testService.doInsert(new Test());
    }
}
