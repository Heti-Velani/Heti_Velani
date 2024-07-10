package com.tns.Interface;

public class Savingacc extends Customer implements Bank
{
	private int accno;
	private float balance;
	
	//parameterized constructor
	public Savingacc(String name, String city, int accno, float balance) {
		super(name, city);
		this.accno = accno;
		this.balance = balance;
	}
	
	//getter and setter
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public float getBalance() {
		return balance;
	}

	
	public void setBalance(float balance) {
		this.balance = balance;
	}



	@Override
	public void deposit(float amount) {
		
		if(amount<0 || amount> deposit_limit)
		{
			System.out.println("Please deposit valid amount");
		}else {
			balance += amount;
			System.out.println("Rs:"+ amount +"is deposited sucessfully");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount<=balance-Minbalance)
		{
			balance-=amount;
			System.out.println("Rs:"+amount+"withdraw is sucessfull");
			
		}else {
			System.out.println("insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "Savingacc [accno=" + accno + ", balance=" + balance + ", getAccno()=" + getAccno() + ", getBalance()="
				+ getBalance() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	
	
	
}
