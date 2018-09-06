package org.feidian.hzau.bbs.data.constant;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
public interface ConfigConstants {
    /** bbs mybatis config file **/
    String MYBATIS_CONFIG = "mybatis-config.xml";

    String HZAU_TRANSACTION_MANAGER = "hzauTransactionManager";
    String DS_MASTER_TM_ALIAS="transactionManager";

    /** bbs master datasource prefix in application.yml **/
    String DS_HZAU_MASTER_PREFIX = "datasource.hzau.master";
    /** bbs master datasource **/
    String DS_HZAU_MASTER = "hzauBbsMasterDataSource";
    /** bbs master datasource mapper base package **/
    String DS_HZAU_MASTER_PACKAGE = "org.feidian.hzau.bbs.**.dao.mapper";
    /** bbs master sqlSessionFactory bean name **/
    String DS_HZAU_MASTER_SSF = "hzauMasterSqlSessionFactory";
    /** bbs master mapper location **/
    String DS_XMS_MASTER_MAPPER_LOCATION = "classpath:org.feidian.hzau.bbs.**.dao.mapper.*.xml";
}
