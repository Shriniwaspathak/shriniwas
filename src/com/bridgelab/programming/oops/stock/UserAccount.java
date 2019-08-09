package com.bridgelab.programming.oops.stock;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelab.programming.algorithm.Input;

public class UserAccount {
	public void buy(int ammount,String stockname) {
		ArrayList<CompanyShare>companyshare=reading.readJson();
		CompanyShare share=null;
		for(companyshare i:companyshare) {
		if(companyname.equals(i.getStockname())) {
			share=1;
			break;       
		}
		
	}
	public static void main(String[] arg) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.print("welcom......!");
		String stockname;
		int sharenumber;
		double shareprice;
		LocalDate time;
		Scanner sc = new Scanner(System.in);
		List<StockAccount> accountObject = new ArrayList<StockAccount>();
		System.out.println("enter the number of stock");
		int number = sc.nextInt();
		StockAccount stockaccount = new StockAccount();
		UserAccount useraccount = new UserAccount();
		for (int i = 0; i < number; i++) {

			System.out.println("enter the name of stock");
			stockname = Input.inputString();

			System.out.println("enter the number of share");
			sharenumber = Input.inputInteger();

			System.out.println("enter the SharePrice");
			shareprice = Input.inputDouble();

			stockaccount.setStockname(stockname);
			stockaccount.setSharenumber(sharenumber);
			double amount = stockaccount.getShareprice();
			stockaccount.setShareprice(shareprice);
			accountObject.add(stockaccount);
		}
		UpdateStockAccount updatestock = new UpdateStockAccount();
		updatestock.addToJson(accountObject);
		System.out.println(accountObject);
		double totalprice = 0;
		List<StockAccount> stockaccountObject = updatestock.readFromJson();
		for (StockAccount account : stockaccountObject) {

			System.out.println(account.getStockname() + " " + account.getSharenumber() + " ");
			System.out.println(stockaccountObject);
			totalprice = totalprice + account.getShareprice();

		}

		System.out.println("total stock value" + totalprice);
	}
}
