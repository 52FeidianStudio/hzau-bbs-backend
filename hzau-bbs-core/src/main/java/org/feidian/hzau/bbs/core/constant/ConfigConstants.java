package org.feidian.hzau.bbs.core.constant;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
public interface ConfigConstants {

    /** 扫描路径 **/
    String BEAN_SCAN_REG = "org.feidian.hzau.bbs.**";
    /** bbs mybatis config file **/
    String MYBATIS_CONFIG = "mybatis-config.xml";

    String HZAU_TRANSACTION_MANAGER = "hzauTransactionManager";
    String DS_MASTER_TM_ALIAS="transactionManager";

    /** bbs master datasource prefix in application.properties **/
    String DS_HZAU_MASTER_PREFIX = "datasource.hzau.master";
    /** 主库数据源 **/
    String DS_HZAU_MASTER = "hzauMasterDataSource";
    /** mapper接口文件扫描路径 **/
    String DS_HZAU_MASTER_PACKAGE = "org.feidian.hzau.bbs.**.dao.mapper";
    /** mybatis的sqlSessionFactory扫描路径 **/
    String DS_HZAU_MASTER_SSF = "hzauMasterSqlSessionFactory";
    /** mapper.xml文件扫描路径 **/
    String DS_HZAU_MASTER_MAPPER_LOCATION = "classpath:org.feidian.hzau.bbs.**.dao.mapper.*.xml";
}
