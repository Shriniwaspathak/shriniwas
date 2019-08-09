package com.bridgelab.programming.oops.stock;

import java.time.LocalDate;
import java.util.Scanner;

import com.bridgelab.programming.datastructure.Stack;

public class StockAccount {
           private String stockname;
           private int sharenumber;
           private double shareprice;
           private LocalDate  time;
		public String getStockname() {
			return stockname;
		}
		public void setStockname(String stockname) {
			this.stockname = stockname;
		}
		public int getSharenumber() {
			return sharenumber;
		}
		public void setSharenumber(int sharenumber) {
			this.sharenumber = sharenumber;
		}
		public double getShareprice() {
			return shareprice;
		}
		public void setShareprice(double shareprice) {
			this.shareprice = shareprice;
		}
		public LocalDate getTime() {
			return time;
		}
		public void setTime(LocalDate time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "StockAccount [stockname=" + stockname + ", sharenumber=" + sharenumber + ", shareprice="
					+ shareprice + ", time=" + time + "]";
		}
		
	    
} 

	    
		
	
	
	


