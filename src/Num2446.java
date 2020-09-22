
public class Num2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5; i ++) {
			for(int j = 0 ; j < i; j++) System.out.print(" ");
			for(int j = 0 ; j < 10-2*i-1; j++) System.out.print("*");
			for(int j = 0 ; j < i; j++) System.out.print(" ");
			System.out.println();
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j <= 5-(i+2); j++) System.out.print(" ");
			for(int j = 0 ; j < 2*i+1 ; j++ )System.out.print("*");
			for(int j = 0 ; j <= 5-(i+2); j++) System.out.print(" ");
			System.out.println();
		}
	}

}
