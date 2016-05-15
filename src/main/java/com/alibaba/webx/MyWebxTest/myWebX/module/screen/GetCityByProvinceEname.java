package com.alibaba.webx.MyWebxTest.myWebX.module.screen;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.webx.MyWebxTest.base.BaseScreenAction;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;

/**
 * 
 * @author zkn 2016-05-15
 *
 */

public class GetCityByProvinceEname extends BaseScreenAction {

	public void execute(@Param("cityEname") String cityEname, Context context) {

		List<CityChinaDO> listCity = 
				mainService.getAddressService().getAllCityByEname(cityEname);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		OutputStream os = null;
		for (CityChinaDO city : listCity) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("id", city.getEcityName());
			map.put("name", city.getCcityName());
			list.add(map);
		}
		String str = listToJson(list);
		closeOutStream(os, str);
	}
	
}
