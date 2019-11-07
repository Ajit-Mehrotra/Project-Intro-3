package Import;
import java.util.*;

public class importJavaConvention {
	public static String inputString() {
		Scanner sc   =  new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		return sc.nextLine();
	}
	public static void main(String args[]){
		String Name = inputString();	
		System.out.println("Happy birthday to you."
					+ "\nHappy birthday to you.");
		System.out.println("Happy birthday dear " 
				+ Name + ",");
		System.out.print("Happy birthday to you.");
		}
	}


