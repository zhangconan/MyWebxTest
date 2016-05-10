package com.alibaba.webx.MyWebxTest.myWebX.module.dao.impl;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.CityDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;

import java.util.List;

/**
 * Created by zkn on 2016/4/18.
 */
public class CityDaoImpl extends AbstractDao implements CityDao{
	/**
	 * 根据省的英文名称得到所有城市的信息
	 * @param ecityName
	 * @return
	 */
    @Override
    public List<CityChinaDO> getAllCityByEname(String ecityName) {
    	
    	List<CityChinaDO> cityChinaList = 
    			getSqlSession().selectList("chinaCityMapper.getCityByEname", ecityName);
        return cityChinaList;
    }
    /**
     * 得到所有的省
     * @return
     */
    @Override
    public List<CityChinaDO> getAllProvince() {
    	
    	List<CityChinaDO> provinceList = 
    			getSqlSession().selectList("chinaCityMapper.allProvince");
    	return provinceList;
    }
}
