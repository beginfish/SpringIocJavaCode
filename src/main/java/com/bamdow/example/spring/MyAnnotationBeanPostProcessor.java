package com.bamdow.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyAnnotationBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean,
			String beanName) throws BeansException {
		System.out.println("Before....beanName="+beanName+",beanType="+bean.getClass().getName());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean,
			String beanName) throws BeansException {
		System.out.println("After....beanName="+beanName+",beanType="+bean.getClass().getName());
		return bean;
	}

}
