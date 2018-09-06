package org.feidian.hzau.bbs.data.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
@Configuration
@Slf4j
public class BbsDataSourceConfiguration {

    @Autowired
    private Environment environment;

    @Value("${datasource.hzaubbs.master.url}")
    private String url;
    @Value("${datasource.hzaubbs.master.username}")
    private String username;
    @Value("${datasource.hzaubbs.master.password}")
    private String password;
    @Value("${datasource.hzaubbs.master.driver}")
    private String driverClassName;

    @Bean(name = ConfigConstants.DS_BBS_MASTER)
    @Primary
    @ConfigurationProperties(prefix = ConfigConstants.DS_BBS_MASTER_PREFIX)
    public DataSource bbsHzauDataSource() {
        log.info("-------------------- xms master data source init ---------------------");
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(driverClassName);
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        return source;
    }
}
