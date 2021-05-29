package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinessAccount;

public class ProgramAccount {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Account acc = new Account(1001,"Rodrigo",0.0);
		BussinessAccount bacc = new BussinessAccount(123,"Empresa",0.0,5000.00);
		
		
		//upcasting
		
		
		Account acc1 = bacc;
		
		acc.getBalance();		
		
		Account acc2 = new BussinessAccount(15201,"Rodrigo",0.0,0.0);
		
		
		//downcast
		
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.
		
		
		
	}

}
