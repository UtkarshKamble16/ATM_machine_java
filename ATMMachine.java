import java.util.*;

class ATM{
	float balance;
	int pin=1234;

	public void checkpin(){
		System.out.println("Enter Your PIN: ");
		Scanner sc=new Scanner(System.in);
		int enterpin=sc.nextInt();
		if (enterpin==pin) {
			menu();
		}else {
			System.out.println("Invalid pin");
		}
	}

	public void menu(){
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C balance: ");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money:" );
		System.out.println("4. Exit");

		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();

		if (opt==1) {
			checkBalance();
		}
		else if(opt==2){
			withdraw();
		}
		else if (opt==3) {
			deposite();
		}
		else if (opt==4) {
			return;
		}
		else{
			System.out.println("Enter a valid choice");
		}
	}

	public void checkBalance(){
		System.out.println("Balance: "+ balance);
		menu();
	}
	public void withdraw(){
		
		System.out.println("enter amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		float amt=sc.nextFloat();
		if (amt>balance) {
			System.out.println("Insufficient Balance");
		}else{
			balance -= amt;
			System.out.println("Money withdraw succefully");
		}
		menu();
	}
	
	public void deposite(){
		System.out.println("Enter amount:");
		Scanner sc=new Scanner(System.in);
		float amt=sc.nextFloat();

		balance+=amt;

		System.out.println("money deposited succefully");
		menu();
	}

}

class ATMMachine{
	public static void main(String[] args) {
		ATM atm=new ATM();
		atm.checkpin();
	}
}