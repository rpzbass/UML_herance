package entities;

public class SavingAccount extends Account {

	private Double interestRate;

	
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance,Double interestRate) {
		super(number,holder,balance);
		this.interestRate = interestRate;
	}

	
	public Double getInterestRate() {

		return this.interestRate;

	}

	public void setInterestRate(Double interest) {

		this.interestRate = interest;

	}
	
	@Override

	//SOBREPOSI��O FAZ COM QUE O COMPILADOR ENTENDA A COEXISTENCIA, DESIGUINANDO A CONTA POUPAN�A SEM TAXA.
	public void withDraw(double amount) {

		this.balance -= amount ;
	}

	
	
	
	
	
}
