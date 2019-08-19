package com.sean.admin.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class SysUser extends BaseEntity<String> implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 40)
    private String password;
    @Column(length = 20)
    private String username;

    public SysUser(String id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public SysUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}