
import java.util.Scanner;
public class FirstSevenSquare {
	
	public static void main(String[] args) {
	// 3. Write a method which takes an input as one number (7) and returns first seven square numbers starting from 0.
			Scanner console = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = console.nextInt();
			SquareNumber(number);
			    
		}
		
		public static void SquareNumber(int n){
			for(int i=1;i<=n;i++){
				System.out.println(i*i);  
			}
		}
}






