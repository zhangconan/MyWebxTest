package com.alibaba.webx.MyWebxTest.myWebX.module.screen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.MainService;

/**
 * 
 * @author zkn 2016-05-10
 *
 */

public class ChinaCity {

	/**
	 * 主服务类
	 */
	@Autowired
	private MainService mainService;
	
	public void execute(Context context){
		
		List<CityChinaDO> provinceChina = 
				mainService.getAddressService().getAllProvince();
		context.put("provinceChina", provinceChina);
	}
}
