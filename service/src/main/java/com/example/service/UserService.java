package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.entity.User;

public interface UserService {

    public User find(int id);

    public IPage<User> selectUserPage(Page<User> page);
}
