package com.fujieid.jap.demo.controller;

import com.fujieid.jap.core.JapUserService;
import com.fujieid.jap.core.result.JapResponse;
import com.fujieid.jap.demo.config.JapConfigContext;
import com.fujieid.jap.oauth2.OAuthConfig;
import com.fujieid.jap.oauth2.Oauth2GrantType;
import com.fujieid.jap.oauth2.Oauth2Strategy;
import me.zhyd.oauth.utils.UuidUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 需要依赖 jap-oauth2 模块
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0.0
 * @date 2021/1/12 14:07
 * @since 1.0.0
 */
@RestController
@RequestMapping("/oauth2")
public class Oauth2PasswordGrantController implements InitializingBean {

    @Resource(name = "oauth2")
    private JapUserService japUserService;
    private Oauth2Strategy oauth2Strategy;


    @RequestMapping("/login/password/jai")
    public JapResponse renderAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JapConfigContext.strategy = "oauth2_password_Grant";
        OAuthConfig config = new OAuthConfig();
        config.setPlatform("jai")
                .setState(UuidUtils.getUUID())
                .setClientId("xx")
                .setClientSecret("xx")
                .setCallbackUrl("http://sso.jap.com:8080/callback/oauthPassword")
                .setTokenUrl("xx")
                .setUserinfoUrl("xx")
                .setScopes(new String[]{"read", "write"})
                // GrantType 设为 password
                .setGrantType(Oauth2GrantType.password)
                // 指定账号密码
                .setUsername("xx")
                .setPassword("xx");
        return oauth2Strategy.authenticate(config, request, response);
    }

    /**
     * 初始化 bean 时对 SimpleStrategy 进行初始化，适用于启用了 SSO 的情况，如果没有启用 SSO，则非强制使用该方式初始化
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        oauth2Strategy = new Oauth2Strategy(japUserService, JapConfigContext.getConfig());
    }
}