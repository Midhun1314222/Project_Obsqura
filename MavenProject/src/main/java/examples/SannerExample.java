package examples;
import java.util.Scanner;

public class SannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();  

        System.out.println("You entered: " + number);

        s.close();


	}

}
