package iaccess.di.ui;

public class ColorPrinter implements Printer{

	@Override
	public void print(String msg) {
		System.out.println("====[Color Print Start]====");
		System.out.println(msg);
		System.out.println("=====[Color Print end]=====");
	}
}
