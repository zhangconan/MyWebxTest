package com.alibaba.webx.MyWebxTest.myWebX.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.CityDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.UserDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;

import mockit.Injectable;

public class AddressServiceImplTest {

	@Injectable
	private UserDao userDao;
	@Injectable
	private CityDao cityDao;

	@Test
	public void getAllCityByEname() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void getAllProvince() {
		List<CityChinaDO> listCity = cityDao.getAllProvince();
		System.out.println(listCity.size());
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
