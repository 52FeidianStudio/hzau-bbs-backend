package org.feidian.hzau.bbs.web.controller;

import org.feidian.hzau.bbs.web.Login;
import org.feidian.hzau.bbs.web.constant.CoreConstants;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
public class BaseController {

    public Login getLogin() {
        Login login = (Login) RequestContextHolder.getRequestAttributes().getAttribute(CoreConstants.CURRENT_LOGIN, RequestAttributes.SCOPE_SESSION);
        return login;
    }
}
