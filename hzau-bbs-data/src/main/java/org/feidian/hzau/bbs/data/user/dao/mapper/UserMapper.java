package org.feidian.hzau.bbs.data.user.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.feidian.hzau.bbs.data.user.entity.User;

import java.util.List;
import java.util.Set;

/**
 * @author stormphoenix
 * @date 2018-09-06
 * @time 下午11:20
 */
@Mapper
public interface UserMapper {

    List<User> listAll();

    List<User> listByIds(@Param("ids") Set<Long> ids, @Param("enable") Boolean enable);

    int insert(@Param("user") User user);
}
