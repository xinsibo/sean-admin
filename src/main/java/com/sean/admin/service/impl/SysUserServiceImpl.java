package com.sean.admin.service.impl;

import com.sean.admin.dao.mapper.SysUserMapper;
import com.sean.admin.dao.repository.SysUserRepository;
import com.sean.admin.entity.SysUser;
import com.sean.admin.entity.SysUserExample;
import com.sean.admin.formbean.SysUserForm;
import com.sean.admin.model.SysUserModel;
import com.sean.admin.service.BaseService;
import com.sean.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-19
 **/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserModel,SysUser, SysUserExample> implements SysUserService {


}
