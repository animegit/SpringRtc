package com.SpringRtc.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin("*")
@Slf4j
public class UserController {
private   UserSerivce serivce;





    @PostMapping()
    public void register(User user){
       serivce.register(user);
    }
    @PostMapping("/login")
    public User login(User user){

        return serivce.login(user);
    }
    @PostMapping("/logout")

    public void logout(String email){
        serivce.logout(email);


    }
    @GetMapping()
    public List<User> findall(){
        return serivce.findall();
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception e){
        e.printStackTrace();

        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
