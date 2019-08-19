package com.sean.admin.formbean;

import com.sean.admin.entity.SysUser;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
public class SysUserForm implements BaseForm {

    private String id;

    private String password;

    private String username;

}