package com.example.baikiemtra.service;

import com.example.baikiemtra.model.dto.request.UserLogin;
import com.example.baikiemtra.model.dto.request.UserRegister;
import com.example.baikiemtra.model.dto.response.JWTResponse;
import com.example.baikiemtra.model.entity.Customer;

public interface CustomerService {
    Customer registerUser(UserRegister userRegister);

    JWTResponse login(UserLogin userLogin);
}
