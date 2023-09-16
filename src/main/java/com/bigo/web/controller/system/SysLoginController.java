package com.bigo.web.controller.system;

import com.bigo.bean.LoginBody;
import com.bigo.bean.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysLoginController {

    @RequestMapping("/login")
    public ResponseBody login(@RequestBody LoginBody loginBody) {
        // TODO receive login request
        return ResponseBody.success();
    }
}
