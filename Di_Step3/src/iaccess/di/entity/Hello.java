package iaccess.di.entity;

import iaccess.di.ui.Printer;

public class Hello {
	//스프링 컨테이너가 
	private Printer printer;
	private String name = "";
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello(Printer printer) {
		super();
		System.out.println("constructor 1 parameter");
		this.printer = printer;
	}

	public Hello(Printer printer, String name) {
		System.out.println("constructor 2 parameter");
		this.printer = printer;		
		this.name = name;
		
	}
	
	public Printer getPrinter() {
		return printer;
	}

	public void print(String msg) {
		if(this.name == null) {
		printer.print(msg);
		}else {
			printer.print(this.name + "  " + msg);
		}
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Hello [printer=" + printer +"]" ;
	}
	
	

}
