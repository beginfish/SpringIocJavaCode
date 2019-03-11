package com.bamdow.example.spring;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.bamdow.annotation.BeanInject;

public class MyBeanDefinitionRegistryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		Map<String, Object> map=beanFactory.getBeansWithAnnotation(BeanInject.class);
//		for (String key : map.keySet()) {
//			System.out.println("key="+key+",value="+map.get(key));
//			if("people".equals(key)){
//				People pp = (People) map.get(key);
//				System.out.println("======="+pp.getFruit());
//			}
//		}
		
	}

	

}
