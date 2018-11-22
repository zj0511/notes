package com.springdemo.dao;

import com.springdemo.BaseTest;
import com.springdemo.entity.Assets;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class AssetsDaoTest extends BaseTest {

    @Autowired
    private AssetsDao assetsDao;

    @Test
    public void getAssetsById() {
        Assets assets = assetsDao.getAssetsById("1");
        System.out.println(assets);
    }
}