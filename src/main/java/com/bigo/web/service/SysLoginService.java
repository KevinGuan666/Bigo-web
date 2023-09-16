package com.bigo.web.service;

import com.bigo.bean.LoginBody;
import com.bigo.bean.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class SysLoginService {
    @Autowired
    private AuthenticationManager authenticationManager;

    public ResponseBody doLogin(LoginBody loginBody) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginBody.getUsername(), loginBody.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        // TODO verify authenticate

        return ResponseBody.success();
    }
}
