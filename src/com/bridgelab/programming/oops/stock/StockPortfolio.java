package com.bridgelab.programming.oops.stock;

public class StockPortfolio {
	
	
	private String Stockname;
	private int numberofshare;
	private int sharePrice;
	public String getStockname() {
		return Stockname;
	}
	public void setStockname(String stockname) {
		Stockname = stockname;
	}
	public int getNumberofshare() {
		return numberofshare;
	}
	public void setNumberofshare(int numberofshare) {
		this.numberofshare = numberofshare;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	@Override
	public String toString() {
		return "StockPortfolio [Stockname=" + Stockname + ", numberofshare=" + numberofshare + ", sharePrice="
				+ sharePrice + "]";
	}
	
	
}