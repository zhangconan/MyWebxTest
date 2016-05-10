package com.alibaba.webx.MyWebxTest.myWebX.module.service.impl;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.CityDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zkn on 2016/4/18.
 */
public class AddressServiceImpl implements AddressService{

    @Autowired
    private CityDao cityDao;
	/**
	 * 根据省的英文名称得到所有城市的信息
	 * @param ecityName
	 * @return
	 */
    @Override
    public List<CityChinaDO> getAllCityByEname(String ecityName) {
        return cityDao.getAllCityByEname(ecityName);
    }
    /**
     * 得到所有的省
     * @return
     */
    @Override
    public List<CityChinaDO> getAllProvince() {
    	return null;
    }
}
