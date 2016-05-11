package com.alibaba.webx.MyWebxTest.myWebX.module.screen;

import com.alibaba.citrus.service.requestcontext.parser.ParserRequestContext;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.fastjson.JSON;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.CityChinaDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.AddressService;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zkn on 2016/4/18.
 */
public class GetAddressAction {

    @Autowired
    private ParserRequestContext parseContext;
    @Autowired
    private MainService mainService;

    public void execute(@Param("addressId") String addressId, Context context) {

        List<CityChinaDO> listCity = 
        		mainService.getAddressService().getAllCityByEname(addressId);
        try {
            //输出流
            OutputStream os = parseContext.getResponse().getOutputStream();
            List<Map<String,String>> list = new ArrayList<Map<String, String>>();
            for(CityChinaDO city : listCity){
                Map<String,String> map = new HashMap<String, String>();
                map.put("id",city.getEcityName());
                map.put("name",city.getCciteName());
                list.add(map);
            }
            String str = JSON.toJSONString(list);
            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    public static void main(String[] args){
        Map<String,String> map = new HashMap();
        List<Map<String,String>> list = new ArrayList<Map<String, String>>();
        map.put("id","henan");
        map.put("name","河南");
        list.add(map);
        Map<String,String> map1 = new HashMap();
        map1.put("id","hhubei");
        map1.put("name","湖北");
        list.add(map1);
        System.out.println(JSON.toJSONString(list));
    }
*/

}
