package com.example.demo.Buisness.Services.interfaces;

import com.example.demo.Repository.Dao.interfaces.UserDao;
import com.example.demo.Repository.Entities.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user) {

        userDao.save(user);
    }

    public String getEmailAndPassword(User user) {
        // return userDao.isEmailExsist(user);
        List<User> users = new ArrayList<>();
        users = userDao.findAll();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if ((iterator.next().getEmail()).equals(user.getEmail())) {
                if (((iterator.next().getPassword()).equals(user.getPassword()))) return "Succesfull Login";
                else return "Incorrect Password";

            }
        }
        return "User Doesn't Exist";
    }

}
