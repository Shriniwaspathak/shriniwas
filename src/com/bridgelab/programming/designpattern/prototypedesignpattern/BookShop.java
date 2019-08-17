package com.bridgelab.programming.designpattern.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopName;
	private List<Book> book = new ArrayList<Book>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public void loadData() {
		for (int i = 1; i < 10; i++) {
			Book b = new Book();
			b.setBookid(i);
			b.setBookname("bookname" + i);
			getBook().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", book=" + book + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for (Book b : this.getBook()) {
			shop.getBook().add(b);

		}
		return shop;

	}

}
