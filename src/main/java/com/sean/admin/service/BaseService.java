package com.sean.admin.service;

import java.util.List;

/**
 * create by xinsibo
 * at 2019-08-19
 **/
public interface BaseService<Model,Entity,Condition>{
    List<Model> list(Condition condition);
    boolean add(Entity entity);
    boolean update(Entity entity);
    boolean delete(Condition condition);
}
