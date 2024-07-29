package colHw4;

import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
	public  static void main(String [] arg) {
		ArrayList<String> st = new ArrayList<>();
		int lenght=0;
		try (Scanner scanner = new Scanner(System.in)) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            
            String input = scanner.nextLine();
            if(input.length()>lenght)
            	lenght=input.length();
            st.add(input);
        }
		}
    	catch (Exception e) {
        // Handle other exceptions
        System.out.println("An error occurred: " + e.getMessage());
    	}


        for (String str : st) {
        	if(str.length()==lenght) {
        		System.out.println("The largest string you entered is:" + str);
        	}
        }
	}
}
