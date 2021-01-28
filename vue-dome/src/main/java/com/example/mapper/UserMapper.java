package com.example.mapper;

import com.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-28
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有用户的信息
     * @return
     */
    List<User> findAllUser();
}
