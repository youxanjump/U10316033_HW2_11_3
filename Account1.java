public class Account{
	
	private int id = 0;//id
	private double balance = 0;//balance
	private double annualInterestRate = 0;//rate for year
	private java.util.Date dateCreated;//date
	
	//no-arg constructor to define date
	Account(){
		dateCreated = new java.util.Date();
	}
	
	//constructor with args to define date, id, balance 
	Account(int id,double balance){
		dateCreated = new java.util.Date();
		this.id = id;
		this.balance = balance;
	}
	
	//a method to set id 
	void setId(int id){
		this.id = id;
	}
	
	//a method to set balance
	void setBalance(double balance){
		this.balance = balance;
	}
	
	//a method to get id
	int getId(){
		return id;
	}
	
	//a method to get balance
	double getBalance(){
		return balance;
	}
	
	//a method to get date
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//a method to set the rate for year
	void setAnnualInterestRate(){
		annualInterestRate = 4.5;
	}
	
	//a method to get the rate for year
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//a method to take money
	void withdraw(double takeMoney){
		balance = balance - takeMoney;
	}
	
	//a method to store money
	void depoist(double storeMoney){
		balance = balance + storeMoney;
	}
	
	//a method to get monthly rate
	double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//a method to get monthly interest
	double getMonthlyInterest(){
		return balance * getMonthlyInterestRate() / 100;
	}
	
	
	public static void main(String[] args){
		setID(1122);
		setBalance(20000);
		setAnnualInterestRate();
		System.out.print("Your ID is: " + getID() + "\nYou have $" + getBalance());
		withdraw(2500);
		depoist(3000);
		System.out.print("Today is " + getDateCreated() + "\nYou have " + getBalance() + " now\nYour monthly rate is " + getMonthlyInterestRate() + "\nYour monthly interest is " + getMothInterest());
	}
}

