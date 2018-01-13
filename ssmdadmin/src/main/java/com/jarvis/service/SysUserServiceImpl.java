package com.jarvis.service;

import com.jarvis.dao.SysUserDao;
import com.jarvis.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jarvis on 2018/1/11.
 * @version v1.0
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUser getUserByid(String id) {
        return sysUserDao.getUserByid(id);
    }
}
