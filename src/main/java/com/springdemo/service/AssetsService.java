package com.springdemo.service;

import com.springdemo.entity.Assets;
import org.springframework.stereotype.Service;

public interface AssetsService {

    /**
     * 根据id获取资产信息
     * @param assetsid 资产id
     * @return 资产信息
     */
    Assets getAssetsById(String assetsid);
}
