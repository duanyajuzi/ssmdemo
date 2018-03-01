package com.jarvis.curd.service;

import com.jarvis.curd.dao.SysuserMapper;
import com.jarvis.curd.entity.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;

    public Sysuser getSysuser(String id) {
        return sysuserMapper.getSysuser(id);
    }
}
