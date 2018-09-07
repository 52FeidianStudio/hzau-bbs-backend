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
public class User {
    public Long id;
    public String username;
    public String number;
    public String email;
    public String mobile;
    public Date updateTime;
    public Date createTime;
}
