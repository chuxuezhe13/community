package com.example.community.service;

import com.example.community.dao.DiscussPostMapper;
import com.example.community.dao.UserDao;
import com.example.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*通过外键查询user表的数据，采用这个service类查询，方便后期使用redis*/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User findUserById(int id){

        return userDao.queryById(id);
    }
}
