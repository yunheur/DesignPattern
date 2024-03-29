package account;

public class MinusAccount extends Account{

	private double limitedMoney;
	
	public MinusAccount(double limitedMoney){
		super();
		this.limitedMoney = limitedMoney;
		wt = new MinusWithdrawTransaction(limitedMoney);
	}
	public MinusAccount(double balance, double limitedMoney){
		super(balance);
		this.limitedMoney = limitedMoney;
		wt = new MinusWithdrawTransaction(limitedMoney);
	}	
	
	public String toString(){
		return "[MinusAccount] CreateDate : " + createDate + " Balance : " + balance + " LimitedMoney : " + limitedMoney;
	}
}
