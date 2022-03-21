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
		this.printer = printer;
		// TODO Auto-generated constructor stub
	}

	public Hello(Printer printer, String name) {
		super();
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	
	
	public Printer getPrinter() {
		return printer;
	}

	public void print(String msg) {
		if(this.name != null) {
			printer.print(this.name + "  " + msg);
		}else {
			printer.print(msg);
		}
	}

	public void setPrinter(Printer printer) {
		System.out.println("Injection => setPrinter(Printer printer)");
		this.printer = printer ;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Injection => setName(String name)");
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Hello [printer=" + printer +"]" ;
	}
	
	

}
