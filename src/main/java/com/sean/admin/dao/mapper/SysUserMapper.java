package com.sean.admin.dao.mapper;

import com.sean.admin.entity.SysUser;
import com.sean.admin.entity.SysUserExample;
import java.util.List;

import com.sean.admin.formbean.SysUserForm;
import com.sean.admin.model.SysUserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.enterprise.inject.Model;

@Repository
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser, SysUserExample,String> {

}