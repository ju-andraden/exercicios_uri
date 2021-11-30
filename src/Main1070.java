import java.util.Scanner;

public class Main1070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int x = sc.nextInt();
		
		while (cont < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				cont++;
			}
			
			x++;
		}
		
		sc.close();

	}

}
