package com.sean.admin.controller;

import com.sean.admin.entity.SysUser;
import com.sean.admin.entity.SysUserExample;
import com.sean.admin.model.SysUserModel;
import com.sean.admin.service.BaseService;
import com.sean.admin.service.SysUserService;
import com.sean.admin.vo.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-19
 **/

public class BaseController<Model,Entity,Condition> {
    @Autowired
    private BaseService<Model,Entity,Condition> baseService;

    @GetMapping("/list")
    public Json list(Condition condition){
        List<Model> list = baseService.list(condition);
        return Json.succ().data(list);
    }
    @PostMapping("/add")
    public Json add(Entity entity){
        if(baseService.add(entity)){
            return Json.succ();
        }
        return Json.fail();
    }
    @PutMapping("/update")
    public Json update(Entity entity){
        if(baseService.update(entity)){
            return Json.succ();
        }
        return Json.fail();
    }
    @DeleteMapping("/delete")
    public Json delete(Condition condition){
        if(baseService.delete(condition)){
            return Json.succ();
        }
        return Json.fail();
    }
}
