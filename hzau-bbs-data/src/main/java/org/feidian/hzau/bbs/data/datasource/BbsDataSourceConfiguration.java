package org.feidian.hzau.bbs.data.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
@Configuration
@Slf4j
public class BbsDataSourceConfiguration {

    @Bean(name = ConfigConstants.DS_BBS_MASTER)
    @Primary
    @ConfigurationProperties(prefix = ConfigConstants.DS_BBS_MASTER_PREFIX)
    public DataSource bbsHzauMasterDataSource() {
        log.info("-------------------- xms master data source init ---------------------");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = ConfigConstants.DS_BBS_SLAVER)
    @Primary
    @ConfigurationProperties(prefix = ConfigConstants.DS_BBS_SLAVER_PREFIX)
    public DataSource bbaHzauSlaveDataSource() {
        log.info("-------------------- xms slaver data source init ---------------------");
        return DataSourceBuilder.create().build();
    }
}
