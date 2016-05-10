package com.alibaba.webx.MyWebxTest.myWebX.module.action;

import com.alibaba.citrus.service.requestcontext.parser.ParserRequestContext;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.Param;
import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * Created by wb-zhangkenan on 2016/4/7.
 */
public class FileUploadAction {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    /**
     * Webx默认解析请求的类
     */
    @Autowired
    private ParserRequestContext parserContext;

    public void doUpload(@Param("userName") String name, Context context, Navigator na) {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        System.out.println("userName:"+userName+"   passWord:"+passWord);
        //Webx实现文件上传
        FileItem fileItem = parserContext.getParameters().getFileItem("fileUpload");
        String fileDir = "D:\\Document";
        try{
            fileItem.write(new File(fileDir+"\\"+System.currentTimeMillis()+fileItem.getName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
