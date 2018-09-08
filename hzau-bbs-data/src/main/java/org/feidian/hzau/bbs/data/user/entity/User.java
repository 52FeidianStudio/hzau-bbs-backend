package org.feidian.hzau.bbs.data.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.feidian.hzau.bbs.core.constant.EnableEnum;

import java.util.Date;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 下午11:18
 */
@Getter
@Setter
@ToString
public class User {
    public Long id;
    public String username;
    public String number;
    public String email;
    public String mobile;
    public EnableEnum enable;
    public Date updateTime;
    public Date createTime;
}
