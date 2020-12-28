package entities;



public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	// Superclasse Constructor
	public Account() {

	}

	// Super Classe Overload
	public Account(Integer number, String holder, Double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(Double balance) {

		this.balance = balance;
	}

	
	
	
	// Access methods
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {

		this.number = number;
	}

	public String getHolder() {

		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {

		return this.balance;
	}



	// Methods Especials
	public void withDraw(double amount) {

		this.balance -= amount + 5.0;    
	}

	public void deposit(Double amount) {

		this.balance += amount ;
	}



	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("----------BANK JAVA v0.2---------------\n");
		sb.append("\n\nHOLDER NAME: "+ this.getHolder()+"\n");
		sb.append("NUMBER ACCOUNT: "+this.getNumber()+"\n");
		sb.append("BALANCE "+ String.format("%.2f",this.getBalance()) +"\n");
		
		return sb.toString();
		
	}


}
