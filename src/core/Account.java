package core;

public abstract class Account {
		protected double balance;
		protected String title;

		protected abstract void transfer(Account account, double amount);

		protected abstract void addMoney(double amount);
}
