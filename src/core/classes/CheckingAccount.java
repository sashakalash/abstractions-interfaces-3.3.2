package core.classes;

import core.NotOverdraftableAccount;
import core.interfaces.Payable;

public class CheckingAccount extends NotOverdraftableAccount implements Payable {

		public CheckingAccount(double balance, String title) {
				super(balance, title);
		}

		public void pay(double amount) {
				if (amount > balance) {
						System.out.println("Недостаточно средств на счете! Ваш баланс составляет: " + balance + " условных единиц");
						return;
				}
				balance -= amount;
				System.out.println("Со счета " + title + " оплачено на сумму " + amount + " условных единиц, остаток(задолженность) по счету составляет: " + balance);
		}
}
