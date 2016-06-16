package com.alibaba.webx.MyWebxTest.myWebX.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.CityDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.UserDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;

import mockit.Injectable;

public class AddressServiceImplTest extends AbstractTestNG{

	@Injectable
	private UserDao userDao;
	@Autowired
	@Qualifier("cityDao")
	private CityDao cityDao;

	@Test
	public void getAllCityByEname() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getAllProvince() {
		List<CityChinaDO> listCity = cityDao.getAllProvince();
		System.out.println("省分的数量"+listCity.size());
	}

	@Test
	public void getCityDao() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void setCityDao() {
		throw new RuntimeException("Test not implemented");
	}
}
