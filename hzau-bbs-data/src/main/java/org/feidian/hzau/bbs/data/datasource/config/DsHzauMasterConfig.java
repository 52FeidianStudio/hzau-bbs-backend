package org.feidian.hzau.bbs.data.datasource.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.feidian.hzau.bbs.data.constant.ConfigConstants;
import org.feidian.hzau.bbs.data.datasource.DruidDataSourceBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */

@Slf4j
@Configurable
@MapperScan(basePackages = ConfigConstants.DS_HZAU_MASTER_PACKAGE,
        sqlSessionFactoryRef = ConfigConstants.DS_HZAU_MASTER_SSF)
public class DsHzauMasterConfig {

    @Autowired
    private Environment environment;

    @Primary
    @Bean(name = ConfigConstants.DS_HZAU_MASTER)
    @ConfigurationProperties(prefix = ConfigConstants.DS_HZAU_MASTER_PREFIX)
    public DataSource hzauMasterDataSource() throws SQLException {
        log.info("-------------------- hzau bbs master data source init ---------------------");
        return DruidDataSourceBuilder.create().build(environment, ConfigConstants.DS_HZAU_MASTER_PREFIX);
    }

    @Primary
    @Bean(name = {ConfigConstants.HZAU_TRANSACTION_MANAGER, ConfigConstants.DS_MASTER_TM_ALIAS})
    public DataSourceTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(hzauMasterDataSource());
    }

    @Primary
    @Bean(name = ConfigConstants.DS_HZAU_MASTER_SSF)
    public SqlSessionFactory xmsMasterSqlSessionFactory(@Qualifier(ConfigConstants.DS_HZAU_MASTER) DataSource xmsMasterDataSource) throws Exception {
        log.info("-------------------- hzau master data source sql session factory init ---------------------");
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(xmsMasterDataSource);
        sessionFactory.setConfigLocation(new ClassPathResource(ConfigConstants.MYBATIS_CONFIG));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(ConfigConstants.DS_XMS_MASTER_MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
