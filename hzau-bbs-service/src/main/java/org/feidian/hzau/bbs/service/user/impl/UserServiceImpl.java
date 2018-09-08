package org.feidian.hzau.bbs.service.user.impl;

import org.feidian.hzau.bbs.data.user.dao.mapper.UserMapper;
import org.feidian.hzau.bbs.data.user.entity.User;
import org.feidian.hzau.bbs.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stormphoenix
 * @date 2018-09-07
 * @time 下午2:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    public List<User> getAll() {
        return mapper.listAll();
    }

    @Override
    public int create(User user) {
        if (user == null) {
            return 0;
        }
        return mapper.insert(user);
    }
}
