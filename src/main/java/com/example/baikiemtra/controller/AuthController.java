package com.example.baikiemtra.controller;

import com.example.baikiemtra.model.dto.request.UserLogin;
import com.example.baikiemtra.model.dto.request.UserRegister;
import com.example.baikiemtra.model.dto.response.APIResponse;
import com.example.baikiemtra.model.dto.response.JWTResponse;
import com.example.baikiemtra.model.entity.Customer;
import com.example.baikiemtra.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @Autowired
    private CustomerService userService;

    @PostMapping("/register")
    public ResponseEntity<APIResponse<Customer>> registerUser(@RequestBody UserRegister userRegister) {
        return new ResponseEntity<>(new APIResponse<>(true, "Register user successfully!", userService.registerUser(userRegister), HttpStatus.CREATED), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<APIResponse<JWTResponse>> login(@RequestBody UserLogin userLogin){
        return new ResponseEntity<>(new APIResponse<>(true,"Login successfully!",userService.login(userLogin), HttpStatus.OK),HttpStatus.OK);
    }
}
