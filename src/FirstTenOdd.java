import java.util.Scanner;
public class FirstTenOdd {
	
	public static void main(String[] args) {
	// 2. Write a method which takes an input as one number (10) and returns first ten odd numbers starting from 0.
			Scanner console = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = console.nextInt();
			OddNumber(number);
			    
		}
		
		public static void OddNumber(int n){
			for(int i=1;i<=n;i++){
				System.out.println(i*2);  
			}
		}
}






