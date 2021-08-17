import core.classes.CheckingAccount;
import core.classes.CreditAccount;
import core.classes.SavingsAccount;

public class Main {

    public static void main(String[] args) {
				CheckingAccount checkingAccount = new CheckingAccount(0, "Расчетный");
				CreditAccount creditAccount = new CreditAccount(0, "Кредитный");
				SavingsAccount savingsAccount = new SavingsAccount(200_000, "Сберегательный");

				checkingAccount.addMoney(100_000);
				checkingAccount.pay(85_000);
				checkingAccount.transfer(savingsAccount, 10_000);
				checkingAccount.transfer(creditAccount, 10_000);
				checkingAccount.transfer(creditAccount, 5_000);
				creditAccount.pay(15_000);
				creditAccount.pay(5_000);
				checkingAccount.transfer(creditAccount, 1000);
				savingsAccount.transfer(creditAccount, 25_000);
		}
}
