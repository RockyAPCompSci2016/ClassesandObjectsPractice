
public class SavingsAccountTester {

	public static void main(String[] args) {
		SavingsAccount myAccount= new SavingsAccount("Adrian KLey", 1000.,.1);
		myAccount.addInterest();
		System.out.println(myAccount.seebalance());
	}

}
