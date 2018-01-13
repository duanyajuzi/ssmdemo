package com.jarvis.dao;

import com.jarvis.entity.SysUser;

/**
 * @author jarvis on 2018/1/11.
 * @version v1.0
 */
public interface SysUserDao {
    SysUser getUserByid(String id);
}
