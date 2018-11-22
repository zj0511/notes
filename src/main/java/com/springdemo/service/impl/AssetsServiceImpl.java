package com.springdemo.service.impl;

import com.springdemo.dao.AssetsDao;
import com.springdemo.entity.Assets;
import com.springdemo.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetsServiceImpl implements AssetsService {

    @Autowired
    private AssetsDao assetsDao;

    @Override
    public Assets getAssetsById(String assetsid) {
        return assetsDao.getAssetsById(assetsid);
    }
}
