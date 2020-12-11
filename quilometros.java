import java.util.Scanner;
public class quilometros {
	public static void main(String[]args) {
	double metros;	
	Scanner in=new Scanner(System.in);
	
	System.out.print("Digite os metros=");
	metros=in.nextDouble();
	
	metros=metros/1000;
	
	System.out.println("O valor em quilometros é:");
	System.out.println(metros);
	
	in.close();
	
	}
}	
		