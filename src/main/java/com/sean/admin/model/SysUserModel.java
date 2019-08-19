package com.sean.admin.model;

import lombok.Data;

import javax.enterprise.inject.Model;
import javax.persistence.*;
import java.io.Serializable;

@Model
@Data
public class SysUserModel implements Serializable {
    private String id;

    private String password;

    private String username;

}