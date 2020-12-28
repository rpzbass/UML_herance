package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class program {

	public static void main(String[] args) {
		
		
			BusinessAccount account = new BusinessAccount(0.0,200.0); //FOI ESTABELICIDO UM LIMITE DE 200 NO METODO CONSTRUTOR
			Scanner input = new Scanner(System.in);
		
			SavingAccount acc1 = new SavingAccount(1020,"zero",1000.0,0.10);
			
			
			Account cc5 = new BusinessAccount(2020,"APTEK_FDP",1000.0,200.0);  //BUsinessAcount PODE SER ESTANCIADA PORQUE É UMA DERIVADA DA SUPERCLASSE OU CLASSE BASE
			
			
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
			
			account.loanLimit(100.0); //FEITO UM EMPRESTIMO DE 100   NO QUAL O MESMO POSSUI UMA TAXA DE 10.0
			account.getBalance();
			
			acc1.withDraw(500.0);
			System.out.print(account);
			
			System.out.print(acc1);
		
			System.out.print(cc5);
		
			input.close();
		
		

	}

}
