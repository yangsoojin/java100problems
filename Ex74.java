import java.util.ArrayList;
import java.util.Scanner;

public class Ex74 {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.print("약수를 구할 숫자를 입력하세요>");
		int num = scan.nextInt();
		for(int i = 1; i<30; i++) {
			if(num%i==0) {
				System.out.print(", "+i);
			}
		}
	}
}
