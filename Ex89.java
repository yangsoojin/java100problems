public class Ex89 {
    public static void main(String[] args) {
		
		int sum = 12;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == sum) {
					System.out.println(i+","+j);
				}
			}
		}
		
	}
}
