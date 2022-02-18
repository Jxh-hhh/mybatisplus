package com.example.mybatisplus.model.dto;

import lombok.Data;

@Data
public class UserInfoDTO {
    private Long id;
    private String name;
    private Long userType;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }
}
