package com.example.userserviceaprbatch24.dtos;

import com.example.userserviceaprbatch24.models.Role;
import com.example.userserviceaprbatch24.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;

    public  UserDto(String name, String email){
        this.name = name;
        this.email = email;
    }
    public static UserDto from(User user) {
        UserDto userDto = new UserDto(user.getName(), user.getEmail());
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setRoles(user.getRoles());

        return userDto;
    }
}
