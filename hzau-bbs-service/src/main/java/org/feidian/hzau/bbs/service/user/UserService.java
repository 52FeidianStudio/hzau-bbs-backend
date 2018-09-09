package org.feidian.hzau.bbs.service.user;

import org.feidian.hzau.bbs.data.entity.User;

import java.util.List;

/**
 * @author stormphoenix
 * @date 2018-09-07
 * @time 下午2:15
 */
public interface UserService {

    List<User> getAll();

    int create(User user);
}
