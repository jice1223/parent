package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.entity.User;

public interface UserService {

    public User find(int id);

    public void addUser(User user);
    public IPage<User> selectUserPage(Page<User> page);
    public void updateUser(Integer id,Integer old);
}
