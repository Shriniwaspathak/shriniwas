package com.bridgelab.programming.oops.stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelab.programming.algorithm.Input;

public class StockReport {
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Welcome...");
    String stockname;
	int numberofstock;
	int sprice;
	Scanner sc=new Scanner(System.in);
	List<StockPortfolio> stockObject=new ArrayList<StockPortfolio>();
	System.out.println("enter the number of stock :.....................");
	int number=sc.nextInt();
//	int number=Input.inputInteger();
	StockPortfolio sfolio=new StockPortfolio();
	for(int i=0;i<number;i++) {
		
		System.out.println("enter the name of stock :");
		 stockname=Input.inputString();
		 
		 System.out.println("enter the number of share :");
		 numberofstock=Input.inputInteger();
		 
		 System.out.println("enter the share price :");
	      sprice=sc.nextInt();
	  
	      sfolio.setStockname(stockname);
	      sfolio.setNumberofshare(numberofstock);
	      sfolio.setSharePrice(sprice);
	      stockObject.add(sfolio); 
	
	    System.out.println();
	}	
	StockImplementation stockimplementation= new StockImplementation();
	stockimplementation.addToJson(stockObject);
	long totalprice=0;
	
	List<StockPortfolio> stockportfolioObjects=stockimplementation.readFromJson();
	for(StockPortfolio stock:stockportfolioObjects) {
		System.out.println(stock.getStockname()+" "+stock.getNumberofshare()+" "+stock.getSharePrice());
		//System.out.println(stockportfolioObjects);
		
	}
	System.out.println("total stock value"+totalprice);
}
}
