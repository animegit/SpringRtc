package com.SpringRtc.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class UserSerivce {
    public static final List<User> userlist=new ArrayList<>();


    public void register(User user){
user.setStatus("ONLINE");
        userlist.add(user);
    }
    public User login(User user){

        var index= IntStream.range(0, userlist.size()).filter(i -> userlist.get(i).getEmail().equals(user.getEmail())).findAny().orElseThrow(()->new RuntimeException("User Not found"));
     var cuser=userlist.get(index);
     if(!cuser.getPassword().equals(user.getPassword())){
         throw new RuntimeException("Password Incorrect");


     }
     user.setStatus("ONLINE");
     return cuser;
    }

    public void logout(String email){
        var index= IntStream.range(0, userlist.size()).filter(i -> userlist.get(i).getEmail().equals(email)).findAny().orElseThrow(()->new RuntimeException("User Not found"));
        userlist.get(index).setStatus("OFFLINE");


    }
    public List<User> findall(){
        return userlist;
    }

}
