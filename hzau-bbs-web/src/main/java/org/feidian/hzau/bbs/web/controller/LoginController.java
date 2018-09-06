package org.feidian.hzau.bbs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 上午12:43
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
