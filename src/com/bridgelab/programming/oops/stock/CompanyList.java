package com.bridgelab.programming.oops.stock;

import java.util.List;

public class CompanyList {
	public String companyname;
	public String companyshare;
	
	
	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getCompanyshare() {
		return companyshare;
	}


	public void setCompanyshare(String companyshare) {
		this.companyshare = companyshare;
	}


	@Override
	public String toString() {
		return "CompanyList [companyname=" + companyname + ", companyshare=" + companyshare + "]";
	}
	

}
