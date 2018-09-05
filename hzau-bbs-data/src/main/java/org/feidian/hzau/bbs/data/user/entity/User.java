package org.feidian.hzau.bbs.data.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 上午1:31
 */
@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String email;
    public String mobile;
    public Boolean isDeleted;
    public Long createrId;
    public Date updateTime;
    public Date createTime;
}
