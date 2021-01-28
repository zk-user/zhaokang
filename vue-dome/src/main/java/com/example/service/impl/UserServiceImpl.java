package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();


    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteById(id);
    }
}
