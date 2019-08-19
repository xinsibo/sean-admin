package com.sean.admin.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.sean.admin.dao.mapper.SysUserMapper;
import com.sean.admin.dao.repository.SysUserRepository;
import com.sean.admin.entity.SysUser;
import com.sean.admin.entity.SysUserExample;
import com.sean.admin.formbean.SysUserForm;
import com.sean.admin.model.SysUserModel;
import com.sean.admin.service.SysUserService;
import com.sean.admin.vo.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-18
 **/
@Controller
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @GetMapping("/list")
    public Json list(SysUserExample condition){
        List<SysUserModel> list = sysUserService.list(condition);
        return Json.succ().data(list);
    }
    @PostMapping("/add")
    public Json add(SysUser entity){
        if(sysUserService.add(entity)){
            return Json.succ();
        }
        return Json.fail();
    }
    @PutMapping("/update")
    public Json update(SysUser entity){
        if(sysUserService.update(entity)){
            return Json.succ();
        }
        return Json.fail();
    }
    @DeleteMapping("/delete")
    public Json delete(SysUserExample condition){
        if(sysUserService.delete(condition)){
            return Json.succ();
        }
        return Json.fail();
    }
}
