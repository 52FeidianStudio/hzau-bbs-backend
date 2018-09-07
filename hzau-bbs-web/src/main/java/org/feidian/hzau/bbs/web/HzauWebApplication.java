package org.feidian.hzau.bbs.web;

import org.feidian.hzau.bbs.core.constant.ConfigConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author stormphoenix
 * @date 2018-09-05
 * @time 下午11:29
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {ConfigConstants.BEAN_SCAN_REG})
public class HzauWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzauWebApplication.class, args);
    }
}
