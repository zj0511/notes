package com.springdemo.dao;

import com.springdemo.entity.Assets;

public interface AssetsDao {

    /**
     * 根据id查询相应角色资产
     * @param id 角色id
     */
    Assets getAssetsById(String id);
}
