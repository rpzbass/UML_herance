package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {

		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {

		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(Double balance,Double loanLimit) {

		super(balance);
		this.loanLimit = loanLimit;
		
	}

	public Double getLoanlimit() {

		return loanLimit;
	}

	
	public void setLoanlimit(Double loanLimit) {

		this.loanLimit = loanLimit;
	}

	public void loanLimit(Double amount) {

		if (amount <= loanLimit) {

			balance += amount - 10.0;
		}
	}
	@Override
	public void withDraw(double amount) {
		
		super.withDraw(amount);
		this.balance -= 2.0;
		    
	}
	
	
}
