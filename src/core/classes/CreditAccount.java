package core.classes;

import core.NotPayableAccount;
import core.interfaces.Payable;

public class CreditAccount extends NotPayableAccount implements Payable {

		public CreditAccount(double balance, String title) {
				super(balance, title);
		}

		@Override
		public void addMoney(double amount) {
				if (balance + amount > 0) {
						System.out.println("Вы не можете пополнить счет на сумму, превышающую задолженность. Максимальная сумма пополнения " + Math.abs(balance) + " условных едини");
						return;
				}
				super.addMoney(amount);
		}

		public void pay(double amount) {
				balance -= amount;
				System.out.println("Со счета " + title + " оплачено на сумму " + amount + " условных единиц, остаток(задолженность) по счету составляет: " + balance);
		}
}
