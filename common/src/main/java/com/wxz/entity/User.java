package com.wxz.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer userid;
    private String username;
    private String pwd;

}
