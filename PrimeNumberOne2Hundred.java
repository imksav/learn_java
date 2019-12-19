class PrimeNumberOne2Hundred{
	public static void main(String[] args) {
		System.out.println("Print prime number upto 100.");
		int imksav, i, j;
		for (i = 2; i<=100; i++) {
			imksav = 0;

			for (j = 2; j<=(i/2); j++) {
			if (i % j == 0) {
				imksav = 1;
				break;
			}
		}	
	
		if (imksav == 0) {
			System.out.println(i+ "  ");	
		}
	}
		
	}
}