package org.feidian.hzau.bbs.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.feidian.hzau.bbs.core.constant.EnableEnum;
import org.feidian.hzau.bbs.core.constant.YesNoEnum;

import java.util.Date;

/**
 * @author stormphoenix
 * @date 2018-09-09
 * @time 下午4:54
 */
@Getter
@Setter
@ToString
public class Topic {
    private Long id;
    private Long classId;
    private String title;
    private String body;
    private Long userId;
    private EnableEnum enable;
    private Long visitCount;
    private Long replyCount;
    private Long lastModifiedUserId;
    private Date lastModifiedTime;
    private Integer lastRepliedUserId;
    private Date lastRepliedTime;
    private YesNoEnum isClose;
    private Date createTime;
}
