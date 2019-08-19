package com.sean.admin.dao.repository;

import com.sean.admin.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * create by xinsibo
 * at 2019-08-18
 **/
@Repository
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
}
