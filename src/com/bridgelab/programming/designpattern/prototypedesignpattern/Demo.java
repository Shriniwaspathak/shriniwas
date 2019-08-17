package com.bridgelab.programming.designpattern.prototypedesignpattern;

public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Bookie");
		bs.loadData();

		BookShop bs1 = (BookShop) bs.clone();
		bs.getBook().remove(2);
		bs1.setShopName("novel");

		System.out.println(bs);
		System.out.println(bs1);

	}

}
