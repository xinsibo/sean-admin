package com.sean.admin.service.impl;

import com.sean.admin.dao.mapper.BaseMapper;
import com.sean.admin.dao.mapper.SysUserMapper;
import com.sean.admin.dao.repository.SysUserRepository;
import com.sean.admin.entity.SysUser;
import com.sean.admin.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-19
 **/
@Service
public class BaseServiceImpl<Model,Entity,Condition> implements BaseService<Model,Entity,Condition> {
    @Autowired
    private BaseMapper baseMapper;
    @Autowired
    private JpaRepository repository;

    @Override
    public List list(Object condition) {
        List<Model> list = baseMapper.selectByExample(condition);
        return list;
    }

    @Override
    public boolean add(Object entity){
        if(repository.save(entity)!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        if(baseMapper.updateByPrimaryKeySelective(entity)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Object condition) {
        if(baseMapper.deleteByExample(condition)!=0){
            return true;
        }
        return false;
    }
}
