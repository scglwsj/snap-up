package com.snapupproject.service.impl;

import com.snapupproject.dao.UserDOMapper;
import com.snapupproject.dao.UserPasswordDOMapper;
import com.snapupproject.dataobject.UserDO;
import com.snapupproject.dataobject.UserPasswordDO;
import com.snapupproject.service.UserModel;
import com.snapupproject.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDOMapper userDOMapper;
    private final UserPasswordDOMapper userPasswordDOMapper;

    @Autowired
    public UserServiceImpl(UserDOMapper userDOMapper, UserPasswordDOMapper userPasswordDOMapper) {
        this.userDOMapper = userDOMapper;
        this.userPasswordDOMapper = userPasswordDOMapper;
    }

    @Override
    public UserModel getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO == null) {
            return null;
        }
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());

        return convertFromDataObject(userDO, userPasswordDO);
    }

    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO) {
        if (userDO == null) {
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO, userModel);

        if (userPasswordDO != null) {
            userModel.setEncryptedPassword(userPasswordDO.getEncryptedPassword());
        }

        return userModel;
    }
}
