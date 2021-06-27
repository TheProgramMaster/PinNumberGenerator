import java.util.Scanner;
import java.util.Random;
public class twoFactorWork{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String username = "codingIsAwesome";
		String password = "readingIsAwesomeTo";
		System.out.println("Please enter username: ");
		String usernameInput = scan.nextLine();
		System.out.println("Please enter password: ");
		String passwordInput = scan.nextLine();
		while(!usernameInput.equals(username) || !passwordInput.equals(password)){
			System.out.println("Given username and/or password are not equivalent to username or password for account. Please try again: ");
			System.out.println("Please input username: ");
			usernameInput = scan.nextLine();
			System.out.println("Please input password: ");
			passwordInput = scan.nextLine();
		}
		int pin = rand.nextInt(999999);
		System.out.println("To determine that you are not a robot, we have generated a random PIN number and have sent it to you. please enter PIN number below.");
		System.out.println("Your PIN number is: " + pin);
		System.out.println("Please enter PIN number: ");
		int pinInput = scan.nextInt();
		while(pinInput != pin){
			System.out.println("Given response to PIN number inquiry is invalid. Please try again.");
			System.out.println("Your PIN number is: " + pin);
			System.out.println("Please enter PIN number: ");
			pinInput = scan.nextInt();
		}
		System.out.println("You have passed the multi-factor authentication of this software application. You may proceed to the following webpages.");
	}
}
