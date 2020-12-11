import java.util.Scanner;
public class IPVA_2020 {
	public static void main(String[]args) {
	double valordoveiculo,IPVA ;	
	Scanner in=new Scanner(System.in);
	
	System.out.print("Digite o valor do carro=");
	valordoveiculo=in.nextDouble();
	
	IPVA=valordoveiculo*4/100;
	
	System.out.println("O IPVA do carro é:");
	System.out.println(	IPVA);
	
	in.close();
	
	}
}		