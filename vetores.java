

import java.util.Scanner;
public class vetores {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int a[] = new int[10], b[] = new int[10], c[] = new int[10], i=0;
		
		for (i=0; i<10; i++) {
			System.out.println("Digite 10 numeros inteiros para A");
			a[i] = in.nextInt();
			System.out.println("Digite 10 numeros interios para B");
			b[i] = in.nextInt();
		}
		
		System.out.println("Esse é o processo de subtração");
		for (i=0; i<10; i++) {
			
			c[i] = a[i] - b[i];
			System.out.println(a[i]+"-"+b[i]+"="+c[i]);
		}
	in.close();
	}
}
