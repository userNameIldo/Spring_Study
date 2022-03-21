package iaccess.di.entity;

import iaccess.di.ui.Printer;

public class Hello {
	//스프링 컨테이너가 
	private Printer printer;
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello(Printer printer) {
		super();
		this.printer = printer;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void print(String msg) {
		printer.print(msg);
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Hello [printer=" + printer +"]" ;
	}
	
	

}
