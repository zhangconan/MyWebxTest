package com.alibaba.webx.MyWebxTest.base.value;

import java.lang.reflect.Field;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.service.mappingrule.MappingRuleService;
import com.alibaba.citrus.service.moduleloader.ModuleFactory;
import com.alibaba.citrus.service.moduleloader.ModuleLoaderService;
import com.alibaba.citrus.service.pipeline.PipelineContext;
import com.alibaba.citrus.service.pipeline.support.AbstractValve;
import com.alibaba.citrus.util.CollectionUtil;

/**
 * 
 * @author zkn 2016-05-26
 * @description 扩展Pipeline的类包，这个类用来扩展Pipeline中的value，用来验证登录
 */

public class NeedLoginValue extends AbstractValve {

	private static final String DEFAULT_ACTION_PARAM_NAME = "action";

	private final Map<String, Boolean> loginCache = CollectionUtil.createConcurrentHashMap();

	@Autowired
	private ModuleLoaderService moduleLoaderService;

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private MappingRuleService mappingRuleService;

	private ModuleFactory[] factories;

	@Override
	protected void postInit() throws Exception {
		super.postInit();
		Field f = moduleLoaderService.getClass().getDeclaredField("factories");
		try {
			f.setAccessible(true);
			factories = (ModuleFactory[]) f.get(moduleLoaderService);
		} finally {
			f.setAccessible(false);
		}
	}

	@Override
	public void invoke(PipelineContext pipelineContext) throws Exception {

		// 继续执行下一个管道
		pipelineContext.invokeNext();
	}
}
