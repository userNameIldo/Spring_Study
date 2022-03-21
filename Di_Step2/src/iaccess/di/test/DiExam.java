package iaccess.di.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import iaccess.di.entity.Hello;

public class DiExam {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/test/config.xml");
		
		//Hello hello = (Hello)ctx.getBean("hello");
		Hello hello = ctx.getBean(Hello.class);
		//Hello hello = ctx.getBean("hello", Hello.class); //���� ��ü�� ������쿡 �̷��Ծ�
		
		hello.print("hello");
		
		String[] beans = ctx.getBeanDefinitionNames();
		
		Arrays.stream(beans).forEach(System.out::println);
		
//		for(String s : beans) {
//			System.out.println();
//		}
		
		
	}

}
