import java.util.Scanner;
public class numeros_inteiros {
	public static void main(String[]args) {
		double numero1,numero2,numero3,quadradodosnumeros;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Digite o numero 1=");
		numero1=in.nextDouble();
		System.out.print("Digite o numero 2=");
		numero2=in.nextDouble();
		System.out.print("Digite o numero 3=");
		numero3=in.nextDouble();
		
		
		numero1=numero1*2;
		numero2=numero2*2;
		numero3=numero3*2;
		quadradodosnumeros=numero1+numero2+numero3;
		
		System.out.println("O quadrado dos numeros é:");
		System.out.println(quadradodosnumeros);
		
		in.close();
		
	}	
}
	
		
				
