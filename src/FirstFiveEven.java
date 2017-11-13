import java.util.Scanner;
public class FirstFiveEven {
	
	public static void main(String[] args) {
	// 1. Write a method which takes an input as one number (5) and returns first five even numbers starting from 0.
			Scanner console = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = console.nextInt();
			EvenNumber(number);
			    
		}
		
		public static void EvenNumber(int n){
			for(int i=1;i<=n;i++){
				System.out.println(i*2-1);  
			}
		}
}


