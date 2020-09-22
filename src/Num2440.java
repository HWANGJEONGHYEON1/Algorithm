
public class Num2440 {

	public static void main(String[] args) {


		int N = 5;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < i+1; j++) System.out.print("*");
			for(int j = 0 ; j < 2*(N-i-1); j++) System.out.print(" ");
			for(int j = 0 ; j < i+1; j++ ) System.out.print("*");
			System.out.println();
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N-i-1; j++) System.out.print("*");
			for(int j = 0 ; j < 2*(i+1); j++) System.out.print(" ");
			for(int j = 0 ; j < N-i-1; j++) System.out.print("*");
			System.out.println();
		}
		

	}

}

// i = 1 , j =0 , j= 9 
// i = 2 , j = 0,1  , 98