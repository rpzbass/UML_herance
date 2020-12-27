package application;

import java.util.Scanner;

import entities.BusinessAccount;
import entities.SavingAccount;

public class program {

	public static void main(String[] args) {
		
		
			BusinessAccount account = new BusinessAccount(0.0,200.0);
			Scanner input = new Scanner(System.in);
		
			SavingAccount acc1 = new SavingAccount(1020,"zero",1000.0,0.10);
			
			
			
			
			
			System.out.print("Number Account: ");
			account.setNumber(input.nextInt());
			System.out.print("Holder Name: ");
			account.setHolder(input.next());
			input.nextLine();
			System.out.print("Deposit now? Y/N ");
			char opc = input.next().charAt(0);
			if(opc == 'Y') {
				System.out.print("Insert value deposit NOW: ");
				
				Double value = input.nextDouble();
				account.deposit(value);
				
			}
			account.loanLimit(100.0);
			
			acc1.withDraw(500.0);
			System.out.print(account);
			
			System.out.print(acc1);
		
			
		
			input.close();
		
		

	}

}
