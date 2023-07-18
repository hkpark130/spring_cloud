package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class RequestLogin {
    @NotNull(message = "can not be null.")
    @Email
    private String email;

    @NotNull(message = "can not be null.")
    private String pwd;
}
