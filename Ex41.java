import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("½½±â°¡ ´øÁø °øÀÇ À§Ä¡>");
		int ball = scan.nextInt();
		
		if((ball<=40&&ball>=30)||(ball<=70&&ball>=60)) {
			System.out.println("Win");
		}else {
			System.out.println("Lose");
			
		}

	}
}
