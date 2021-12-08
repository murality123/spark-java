package com.demo;

public class ZeeZeeBank {

	
	public static void main(String[] args) {
		
	
long account_Number=9876543210l;
int balance=15000;
System.out.println("Enter the amout to be deposited");
int deposit=1500;
balance=balance+deposit;
System.out.println("Enter the amout to be withdraw");
int withdraw=18500;
if(balance>withdraw) {
	balance=balance-withdraw;
	System.out.println(balance);
}else {
	System.out.println("Insufficient Balance");
}

	}
}
