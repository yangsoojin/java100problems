import java.util.Scanner;

public class Ex24 {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int a = scan.nextInt();
		System.out.print("정수를 입력하세요>");
		int b = scan.nextInt();
		if (b>=a) {
			System.out.println("1");
		}else {
			System.out.println("0");
			
		}
		
	}
}

