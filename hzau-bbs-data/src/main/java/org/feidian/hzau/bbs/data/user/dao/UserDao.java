package org.feidian.hzau.bbs.data.user.dao;

import org.feidian.hzau.bbs.data.user.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 上午1:48
 */
public interface UserDao extends CrudRepository<User, Long> {
}
