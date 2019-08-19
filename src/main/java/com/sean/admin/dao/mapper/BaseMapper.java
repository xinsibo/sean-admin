package com.sean.admin.dao.mapper;

import com.sean.admin.entity.SysRole;
import com.sean.admin.entity.SysRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.enterprise.inject.Model;
import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-19
 *
 * @param <Entity> 实体类
 * @param <Example> 查询条件
 * @param <PK> 主键类型
 */

public interface BaseMapper<Entity,Example,PK> {
    int countByExample(Example example);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(PK id);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<Entity> selectByExample(Example example);

    Entity selectByPrimaryKey(PK id);

    int updateByExampleSelective(@Param("record") Entity record, @Param("example") Example example);

    int updateByExample(@Param("record") Entity record, @Param("example") Example example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);
}
