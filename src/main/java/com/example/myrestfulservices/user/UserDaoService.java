package com.example.myrestfulservices.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static{
        users.add(new User(1, "A", new Date()));
        users.add(new User(2, "B", new Date()));
        users.add(new User(3, "C", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        System.out.println(user.getName());
        return users.get(userCount-1);
    }

    public User findById(int id) {

        for(User user : users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){

        for(User user : users){
            if (user.getId() == id){
                users.remove(id);
            }
        }
        return null;
    }

}
