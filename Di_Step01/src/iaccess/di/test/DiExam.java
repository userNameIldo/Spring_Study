package iaccess.di.test;

import iaccess.di.entity.Hello;
import iaccess.di.ui.MonoPrinter;
import iaccess.di.ui.Printer;

public class DiExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new MonoPrinter();
		//Hello hello = new Hello();
		//hello.setPrinter(printer); //setter ���
		Hello hello = new Hello(printer);
		hello.print("�ȳ��ϼ���");
		
	}

}
