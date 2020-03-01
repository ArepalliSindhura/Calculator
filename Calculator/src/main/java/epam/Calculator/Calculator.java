package epam.Calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean n = true;
		int ch;
		int a, b;
		System.out.println("enter the numbers a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		while(n){
			System.out.println("Menu:");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Dvision");
			System.out.println("enter your choice");
			ch = sc.nextInt();
			int choice;
			MathsOperations opr = new MathsOperations();
			switch(ch){
			case 1:
				System.out.println("The sum is " + opr.add(a, b));
				System.out.println("would you like to calculate something else??");
				System.out.println("Please type 1 for yes and 0 for no");
				choice = sc.nextInt();
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 2:
				System.out.println("The sum is " + opr.subtract(a, b));
				System.out.println("would you like to calculate something else??");
				System.out.println("Please type 1 for yes and 0 for no");
				choice = sc.nextInt();
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 3:
				System.out.println("The sum is " + opr.multiply(a, b));
				System.out.println("would you like to calculate something else??");
				System.out.println("Please type 1 for yes and 0 for no");
				choice = sc.nextInt();
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
			case 4:
				System.out.println("The sum is " + opr.divide(a, b));
				System.out.println("would you like to calculate something else??");
				System.out.println("Please type 1 for yes and 0 for no");
				choice = sc.nextInt();
				if(choice == 1){
					n = true;
					break;
				}else{
					n = false;
					break;
				}
				
				default:
					System.out.println("Please enter numbers between 1 to 4");
			}
		}
	}

}
