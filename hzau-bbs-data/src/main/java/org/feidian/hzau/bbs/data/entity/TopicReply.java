package org.feidian.hzau.bbs.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 下午11:18
 */
@Getter
@Setter
@ToString
public class TopicReply {
    /**
     * 评论回复id
     **/
    private Long id;
    /**
     * 帖子id
     **/
    private Long topicId;
    /**
     * 发帖人id
     **/
    private Long userId;
    /**
     * 贴文
     **/
    private String body;
    private Date updateTime;
    private Date createTime;
}
