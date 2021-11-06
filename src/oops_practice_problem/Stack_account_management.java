package oops_practice_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_account_management {
	static ArrayList<Stock> stockreport = new ArrayList<Stock>();

	public static void main(String[] args) {
		StackDetails rv = new StackDetails();
		Stock stock = rv.GetStockReport();
		stockreport.add(stock);
		for (Stock value : stockreport) {
			System.out.println("StackName : " + value.StackName);
			System.out.println("NumberofShare : " + value.NumberofShare);
			System.out.println("SharePrice : " + value.SharePrice);
		}
	}
}

class StackDetails {
	Stock GetStockReport() {
		Scanner stockDetails = new Scanner(System.in);
		System.out.println("Enter the stock name");
		String stockname = stockDetails.nextLine();
		System.out.println("Enter the number of share");
		int numberofshare = stockDetails.nextInt();
		System.out.println("Enter the share price");
		long shareprice = stockDetails.nextLong();

		Stock stockreport = new Stock();
		stockreport.StackName = stockname;
		stockreport.NumberofShare = String.valueOf(numberofshare);
		stockreport.SharePrice = String.valueOf(shareprice);
		return stockreport;
	}
}

class Stock {
	public String StackName;
	public String NumberofShare;
	public String SharePrice;
}