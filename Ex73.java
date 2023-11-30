import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
	
		int[] rule = {1, 10, 2, 20, 3, 30, 4, 40, 5, 
			50, 6, 60, 7, 70, 8, 80, 9, 90, 
			10, 100, 11, 110, 12, 120 };	
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int money = rule[num1-1] + rule[num2-1];
		System.out.println("기부금은 "+money);
	}
}
