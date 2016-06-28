package com.alibaba.webx.MyWebxTest.myWebX.module.action;

import static com.alibaba.citrus.util.StringEscapeUtil.escapeURL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;

/**
 * 
 * @author zkn 2016-06-28
 *
 */

public class DownLoadFileAction {

	@Autowired
	private HttpServletResponse response;
	
	public void execute(Context context){
		
		String fileName = "G:/qqq.txt";
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			String loadFileName = "\"" + escapeURL("zhangsan.txt") + "\"";;
			//重置输出流
			response.reset();
			//设置下载框
			response.setHeader("Content-disposition", "attachment; filename=" + loadFileName);
			//设置文件类型
			response.setContentType("text/plain;charset=UTF-8");
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			bw = new BufferedWriter(new OutputStreamWriter(response.getOutputStream())) ;
			String lineStr = null;
			while((lineStr = br.readLine()) != null){
				bw.write(lineStr);
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
