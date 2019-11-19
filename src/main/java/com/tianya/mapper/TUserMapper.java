package com.tianya.mapper;

import com.tianya.eneity.TUser;

public interface TUserMapper {

    TUser selectByUserName(String userName);

    TUser selectUserByPrimaryKey();
}
