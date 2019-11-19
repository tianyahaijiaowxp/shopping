package com.tianya.service.impl;

import com.tianya.eneity.TUser;
import com.tianya.mapper.TUserMapper;
import com.tianya.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser findUserByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
