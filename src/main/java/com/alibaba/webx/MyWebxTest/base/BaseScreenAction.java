package com.alibaba.webx.MyWebxTest.base;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.service.requestcontext.parser.ParserRequestContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.MainService;

public class BaseScreenAction {

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected ParserRequestContext parserRequestContext;
	@Autowired
	protected MainService mainService;
	
	/**
	 * List集合转换为JSON字符串
	 * @param list
	 * @return
	 */
	protected String listToJson(List<Map<String,String>> list){
		
		return list == null || list.isEmpty()?"{}":JSON.toJSONString(list);
	}
	/**
	 * 关闭输出流
	 * @param os
	 * @param str
	 */
	protected void closeOutStream(OutputStream os, String str) {
		try {
			os = response.getOutputStream();
			os.write(str.getBytes());
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(os != null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
