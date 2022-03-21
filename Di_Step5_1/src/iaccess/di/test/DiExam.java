package iaccess.di.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import iaccess.di.entity.Hello;
import iaccess.di.ui.ColorPrinter;
import iaccess.di.ui.Printer;

public class DiExam {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("iaccess/di/test/config.xml");
		
		//Hello hello = (Hello)ctx.getBean("hello");
		Hello hello = ctx.getBean(Hello.class);
		//Hello hello = ctx.getBean("hello", Hello.class); //���� ��ü�� ������쿡 �̷��Ծ�
		String[] beans = ctx.getBeanDefinitionNames();
		
		Arrays.stream(beans).forEach(System.out::println);
		hello.print("korea");
		
	}

}
