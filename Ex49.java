public class Ex49 {
    public static void main(String[] args) {
		
		
		int hour = 13;
		int min = 40;
		
		int new_hour = 0;
		int new_min = 0;
		
		if( min < 30 ) {
			new_min = min + 60 - 30;
			if(hour<1) {
				new_hour = 23;
			}else {
				new_hour = hour - 1;
			}
		}else {
			new_hour = hour;
			new_min = min - 30;
		}
		System.out.println("30분 이전은 "+new_hour+"시"+new_min+"분");
        
		new_hour = 0;
		new_min = 0;
		if( min >= 30 ) {
			new_min = min - 60 + 30;
			if(hour>=23) {
				new_hour = 0;
			}else {
				new_hour = hour + 1;
			}
		}else {
			new_hour = hour;
			new_min = min + 30;
		}
		
		System.out.println("30분 이후는 "+new_hour+"시"+new_min+"분");

	}

}
