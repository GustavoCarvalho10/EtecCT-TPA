import java.util.Scanner;
public class antecessor {
	public static void main(String[]args) {
		double antecessor,numero,sucessor;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Digite o numero=");
		numero=in.nextDouble();
		
		antecessor=numero-1;
		
		System.out.println("O antecessor é:");
		System.out.println(antecessor);
		
		
		System.out.print("Digite o numero=");
		numero=in.nextDouble();
		
		sucessor=numero+1;
		
		System.out.println("O sucessor é:");
		System.out.println(sucessor);
		
		in.close();
		
	}
}	
		