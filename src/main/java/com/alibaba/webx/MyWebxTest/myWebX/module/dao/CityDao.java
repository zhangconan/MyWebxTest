package com.alibaba.webx.MyWebxTest.myWebX.module.dao;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;

import java.util.List;

/**
 * Created by zkn on 2016/4/18.
 */
public interface CityDao {
	/**
	 * 根据省的英文名称得到所有城市的信息
	 * @param ecityName
	 * @return
	 */
    List<CityChinaDO> getAllCityByEname(String ecityName);
    /**
     * 得到所有的省
     * @return
     */
    List<CityChinaDO> getAllProvince();
}
