import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
               		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int multiSum = num1;
		for(int i=0; i<num3; i++) {
			multiSum = multiSum * num2;
			System.out.println(multiSum);
		}
		
	}
}
