package org.feidian.hzau.bbs.data.datasource;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-6
 */
public interface ConfigConstants {
    /** bbs mybatis config file **/
    String BBS_MYBATIS_CONFIG_FILE_NAME = "bbs-hzau-mybatis-config.xml";
    /** bbs master datasource **/
    String DS_BBS_MASTER = "bbsHzauMasterDataSource";
    /** bbs master datasource prefix in application.yml **/
    String DS_BBS_MASTER_PREFIX = "datasource.hzaubbs.master";
    /** bbs slaver datasource **/
    String DS_BBS_SLAVER = "bbsHzauMasterDataSource";
    /** bbs slave datasource prefix in application.yml **/
    String DS_BBS_SLAVER_PREFIX = "datasource.hzaubbs.slaver";
}
