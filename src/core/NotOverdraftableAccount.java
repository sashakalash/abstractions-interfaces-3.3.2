package core;

public class NotOverdraftableAccount extends NotPayableAccount {

		public NotOverdraftableAccount(double balance, String title) {
				super(balance, title);
		}

		@Override
		public void transfer(Account account, double amount) {
				if (amount > balance) {
						System.out.println("Недостаточно средств на счете " + title + "! Ваш баланс составляет: " + balance + " условных единиц");
						return;
				}
				super.transfer(account, amount);
		}
}
