package com.exam1.model.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel{

    private Long id;

    private String username;

    private String password;

    private String email;
}
