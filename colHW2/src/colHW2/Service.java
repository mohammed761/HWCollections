package colHW2;

import java.util.Random;

public class Service {
	
	public static double getAverage (int a, int b, int c) {
		return ((a+b+c)/3.0);
	}
	public static int getRandomNumber (int min, int max) {
		if(min>max) {
			int x=min;
			min=max;
			max=x;
		}
		Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
	}
	public static boolean isEven (int num) {
		return (num%2)==0;
	}
	public static boolean isOdd (int num) {
		return !isEven(num);
	}
	
    public static void main(String[] args) {
        int randomNum = Service.getRandomNumber(1, 10);
        System.out.println("Random number between 1 and 10: " + randomNum);

        boolean isEven = Service.isEven(randomNum);
        System.out.println("Is the number even? " + isEven);

        boolean isOdd = Service.isOdd(randomNum);
        System.out.println("Is the number odd? " + isOdd);

        double average = Service.getAverage(4, 8, 15);
        System.out.println("Average of 4, 8, 15: " + average);
    }

}
