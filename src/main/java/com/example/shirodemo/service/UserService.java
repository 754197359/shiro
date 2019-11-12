package com.example.shirodemo.service;

import com.example.shirodemo.model.User;

public interface UserService {


        public User findByName(String name);

        public User findById(Integer id);
}
