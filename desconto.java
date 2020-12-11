import java.util.Scanner;
public class desconto {
	public static void main(String[]args) {
	double valorproduto,desconto;	
	Scanner in=new Scanner(System.in);
	
	System.out.print("Digite o valor do produto=");
	valorproduto=in.nextDouble();
	
	desconto=valorproduto*5/100;
	
	System.out.println("O desconto de 5% é=");
	
	System.out.println(desconto);
	
	
	//System.out.print("Digite o valor do desconto=");
	//desconto=in.nextDouble();
	
	valorproduto=valorproduto-desconto;
	
	System.out.println("O total do produto é:");
	System.out.println(valorproduto);
	
	in.close();
	
	}
}	
		