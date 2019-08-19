package com.sean.admin.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="sys_permission")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class SysPermission {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 20)
    private String value;
    @Column(length = 20)
    private String pid;
    @Column(length = 20)
    private String name;
    @Column(length = 1)
    private String type;
    @Column(length = 1)
    private String leaf;

    public SysPermission(String id, String leaf, String name, String pid, String type, String value) {
        this.id = id;
        this.leaf = leaf;
        this.name = name;
        this.pid = pid;
        this.type = type;
        this.value = value;
    }

    public SysPermission() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf == null ? null : leaf.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}