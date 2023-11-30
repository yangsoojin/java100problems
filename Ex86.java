public class Ex86 {
    public static void main(String[] args) {

		
		int n = 5;
		int midIndex = (n/2)+1;
		for(int i=1; i<=midIndex; i++) {
			for(int k=i; k<midIndex; k++) {
				System.out.print(" ");
			}
			for(int j=2; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
