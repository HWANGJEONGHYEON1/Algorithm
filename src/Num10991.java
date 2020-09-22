
public class Num10991 {

	public static void main(String[] args) {
		
		int n = 3;
		
		if(n == 1 ) {
			System.out.println("*");
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < n - (i+1); j++) {
				System.out.print(" ");
			}
			;
			for(int j = 0 ; j <= i; j++) System.out.print(" ß*");
			System.out.println();
		}
	}

}
