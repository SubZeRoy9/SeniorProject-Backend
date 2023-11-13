package com.example.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
    Requests I need to map (I think).....
    POST	/api/auth/signup	signup new account
    POST	/api/auth/signin	login an account
    POST	/api/auth/signout	logout the account
    GET	/api/test/all	retrieve public content
    GET	/api/test/user	access User's content
    GET	/api/test/mod	access Moderator's content
    GET	/api/test/admin	access Admin's content
     */

    @PostMapping("/signup")
    @CrossOrigin(origins = "http://localhost:5173") //Origin of react app
    public String registerUser(@RequestBody User user) { //save user to database
        userRepository.save(user);
        return "User registered successfully";
    }
}

