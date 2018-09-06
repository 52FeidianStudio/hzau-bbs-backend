package org.feidian.hzau.bbs.data.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.core.env.Environment;

import java.sql.SQLException;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
public class DruidDataSourceBuilder {
    public static final String NAME = "state";
    public static final String URL = "url";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String DRIVER_CLASS_NAME = "driver-class-state";
    public static final String INITIAL_SIZE = "initial-size";
    public static final String MAX_ACTIVE = "max-active";
    public static final String MIN_IDLE = "min-idle";
    public static final String MAX_WAIT = "max-wait";
    public static final String POOL_PREPARED_STATEMENTS = "pool-prepared-statements";
    public static final String MAX_POOL_PREPARED_STATEMENT_PER_CONNECTION_SIZE = "max-pool-prepared-statement-per-connection-size";
    public static final String VALIDATION_QUERY = "validation-query";
    public static final String VALIDATION_QUERY_TIMEOUT = "validation-query-timeout";
    public static final String TEST_WHILE_IDLE = "test-while-idle";
    public static final String TEST_ON_BORROW = "test-on-borrow";
    public static final String TEST_ON_RETURN = "test-on-return";
    public static final String TIME_BETWEEN_EVICTION_RUNS_MILLIS = "time-between-eviction-runs-millis";
    public static final String MIN_EVICTABLE_IDLE_TIME_MILLIS = "min-evictable-idle-time-millis";
    public static final String MAX_EVICTABLE_IDLE_TIME_MILLIS = "max-evictable-idle-time-millis";
    public static final String FILTERS = "filters";
    public static final int DEFAULT_TIMEOUT = 0;
    public static final int DEFAULT_SIZE = 0;
    private static final String SUFFIX_SEP = ".";

    public static DruidDataSourceBuilder create() {
        return new DruidDataSourceBuilder();
    }

    public DruidDataSource build(Environment env, String prefix) throws SQLException {
        if (!prefix.endsWith(SUFFIX_SEP)) {
            prefix += ".";
        }
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setName(env.getProperty(prefix + NAME));
        druidDataSource.setUrl(env.getProperty(prefix + URL));
        druidDataSource.setUsername(env.getProperty(prefix + USERNAME));
        druidDataSource.setPassword(env.getProperty(prefix + PASSWORD));
        druidDataSource.setDriverClassName(env.getProperty(prefix + DRIVER_CLASS_NAME));
        druidDataSource.setInitialSize(env.getProperty(prefix + INITIAL_SIZE
                , Integer.class, DruidDataSource.DEFAULT_INITIAL_SIZE));
        druidDataSource.setMaxActive(env.getProperty(prefix + MAX_ACTIVE
                , Integer.class, DruidDataSource.DEFAULT_MAX_ACTIVE_SIZE));
        druidDataSource.setMinIdle(env.getProperty(prefix + MIN_IDLE
                , Integer.class, DruidDataSource.DEFAULT_MIN_IDLE));
        druidDataSource.setMaxWait(env.getProperty(prefix + MAX_WAIT
                , Long.class, (long) DruidDataSource.DEFAULT_MAX_WAIT));
        druidDataSource.setPoolPreparedStatements(env.getProperty(prefix + POOL_PREPARED_STATEMENTS
                , Boolean.class, false));
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(env.getProperty(prefix + MAX_POOL_PREPARED_STATEMENT_PER_CONNECTION_SIZE
                , Integer.class, DEFAULT_SIZE));
        druidDataSource.setValidationQuery(env.getProperty(prefix + VALIDATION_QUERY));
        druidDataSource.setValidationQueryTimeout(env.getProperty(prefix + VALIDATION_QUERY_TIMEOUT
                , Integer.class, DEFAULT_TIMEOUT));
        druidDataSource.setTestWhileIdle(env.getProperty(prefix + TEST_WHILE_IDLE
                , Boolean.class, true));
        druidDataSource.setTestOnBorrow(env.getProperty(prefix + TEST_ON_BORROW
                , Boolean.class, false));
        druidDataSource.setTestOnReturn(env.getProperty(prefix + TEST_ON_RETURN
                , Boolean.class, false));
        druidDataSource.setTimeBetweenEvictionRunsMillis(env.getProperty(prefix + TIME_BETWEEN_EVICTION_RUNS_MILLIS
                , Long.class, DruidDataSource.DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS));
        druidDataSource.setMinEvictableIdleTimeMillis(env.getProperty(prefix + MIN_EVICTABLE_IDLE_TIME_MILLIS
                , Long.class, DruidDataSource.DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS));
        druidDataSource.setMaxEvictableIdleTimeMillis(env.getProperty(prefix + MAX_EVICTABLE_IDLE_TIME_MILLIS
                , Long.class, DruidDataSource.DEFAULT_MAX_EVICTABLE_IDLE_TIME_MILLIS));
        druidDataSource.setFilters(env.getProperty(prefix + FILTERS));
        return druidDataSource;
    }
}
