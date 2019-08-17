package com.bridgelab.programming.oops.regex.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelab.programming.oops.regex.userdetails.UserDetail;

public class DetailImplementation   {
	 BufferedReader br;
      private final String Regex_firstName="<<name>>";
      private final String Regex_fullName="<<full name>>";
      private final String Regex_mobile_Number="xxxxxxxxxx";
      
  	public DetailImplementation(){
			br = new BufferedReader(new InputStreamReader(System.in));
  	}
      public String convertString(UserDetail userDetail,String message){
  		Pattern p = Pattern.compile(Regex_firstName);
  		Matcher m = p.matcher(message); 
  		message = m.replaceAll(userDetail.getFirstName());

  		p = Pattern.compile(Regex_fullName);
  		m = p.matcher(message); 
  		message = m.replaceAll(userDetail.getFullName()+" "+userDetail.getFullName());

  		p = Pattern.compile(Regex_mobile_Number);
  		m = p.matcher(message); 
  		message = m.replaceAll(userDetail.getMobileNumber());

  		
  		return message;
      }
      public String inputString(){
  		try{
  			return br.readLine();
  		}
  		catch(IOException ioe){
  			System.out.println(ioe.getMessage());
  		}
  		return "";
  	}
      public int inputInteger(){
  		try{
  			try{	
  				return Integer.parseInt(br.readLine());
  			}
  			catch(NumberFormatException nfe){
  				System.out.println(nfe.getMessage());	
  			}
  		}catch(IOException ioe){
  			System.out.println(ioe.getMessage());
  		}
  		return 0;
  	}
      public String getFileText(String fileName){
  		try{
  			br=new BufferedReader(new FileReader(fileName));
  			StringBuilder sb=new StringBuilder();
  			String line=br.readLine();
  			while(line!=null){
  				sb.append(line);
  				sb.append(System.lineSeparator());
  				line=br.readLine();
  			}
  			return sb.toString();
  		 }
  		catch(Exception e){
  			return null;
  		}
  		finally{
  			try{
  				br.close();
  			}
  			catch(IOException ioe){
  			}	
  		}
  	}
  	
  	
      
      public void writeToFile(String data,String file1)throws Exception{
    	  
  		File file = new File(" ");
  		if (!file.exists()) {
  			file.createNewFile();
  		}
  		FileWriter writer = new FileWriter(file); 
  		// Writes the content to the file
  		writer.write(data); 
  		writer.flush();
  		writer.close();
  	}
}
