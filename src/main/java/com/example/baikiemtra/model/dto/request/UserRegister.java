package com.example.baikiemtra.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegister {
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String email;
    private String phone;
    private List<String> roles;
}
