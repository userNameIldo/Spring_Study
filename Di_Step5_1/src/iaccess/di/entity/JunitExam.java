package iaccess.di.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iaccess.di.ui.Printer;

public class JunitExam {
	
	static ApplicationContext context;
	
	@BeforeClass
	public static void init() {
		//IoC 컨테이너 생성
		//1.ApplicationContext 객체 생성
		context = new ClassPathXmlApplicationContext("iaccess/di/test/config.xml");
		System.out.println("==============");
		System.out.println("컨테이너 생성");
		System.out.println("컨테이너 객체 : " + context);
	}
	
	@Test
	public void bean1() {

		System.out.println("==============");
		System.out.println("bean1 객체 : " + this);
		System.out.println("bean1 context : " + context);
		System.out.println("==============");
		
		Hello hello = context.getBean(Hello.class);
		assertEquals("SPRING", hello.getName());
		
		hello.print("hello");
		System.out.println(context);
		System.out.println("==============");
		
	}
	
	@Test
	public void bean2() {

		System.out.println("==============");
		System.out.println("bean2 객체 : " + this);
		System.out.println("bean2 context : " + context);
		System.out.println("==============");
		
		Printer printer = (Printer)context.getBean("printer");
		Printer printer2 = context.getBean("printer", Printer.class);
		
		assertSame(printer, printer2);
		
	}
	
	
}
