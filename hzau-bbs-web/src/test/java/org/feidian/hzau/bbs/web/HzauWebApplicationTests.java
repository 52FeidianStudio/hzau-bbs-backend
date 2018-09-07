package org.feidian.hzau.bbs.web;

import lombok.extern.slf4j.Slf4j;
import org.feidian.hzau.bbs.data.entity.User;
import org.feidian.hzau.bbs.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HzauWebApplication.class)
@EnableAutoConfiguration
public class HzauWebApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void getAll() {
        List<User> users = userService.getAll();
        log.info(users.toString());
    }
}
