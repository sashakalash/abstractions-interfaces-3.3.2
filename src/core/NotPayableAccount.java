package core;

public class NotPayableAccount extends Account {

		public NotPayableAccount(double balance, String title) {
				this.title = title;
				this.balance = balance;
		}
		@Override
		public void transfer(Account account, double amount) {
				balance -= amount;
				account.addMoney(amount);
				System.out.println("Перевод co счета " + title + " " + amount + " условных единиц, остаток на счете: " + balance);
		}

		@Override
		public void addMoney(double amount) {
				balance += amount;
				System.out.println("Баланс счета " + title + " пополнен на " + amount + " условных единиц, текущий баланс составляет: " + balance);
		}
}
