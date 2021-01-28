package com.example.service;

import com.example.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-28
 */
public interface IUserService extends IService<User> {
    /**
     * 查询所有用户的信息
     * @return
     */
    List<User> findAllUser();

    /**
     * 插入用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(String id);
}
