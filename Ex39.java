import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int [3];
		for(int i = 0; i<3; i++) {
			System.out.print("숫자를 입력해 주세요>");
			num[i] = scan.nextInt();
		}
		int min = num[0];
		for(int i = 0; i<num.length; i++) {
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("최소값은? "+min);

	}

}
