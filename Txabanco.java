import java.util.Scanner;
public class Txabanco {
	public static void main(String[]args) {
	double valoremprestado,valor_a_pagar,parcelas,valor_juros;	
	Scanner in=new Scanner(System.in);
	
	System.out.print("Digite o valor emprestado=");
	valoremprestado=in.nextDouble();
	System.out.print("Digite a quantidade de parcelas=");
	parcelas=in.nextDouble();
		
	valor_juros=valoremprestado/100*2.5;
	System.out.print("O valor do juros é=");
	System.out.println(valor_juros);
	
	valor_a_pagar=valoremprestado+valor_juros;
	System.out.print("O total com juros é=");
	System.out.println(valor_a_pagar);
	 
	System.out.print("O valor das parcelas é=");
	valor_a_pagar=valor_a_pagar/parcelas;
	System.out.println(valor_a_pagar);
	
	//System.out.println("A quantidade de meses para o emprestimo ser pago é:");
	//System.out.println(parcelas);
	
	//System.out.println(valor_a_pagar);
	
	in.close();
	
	}
}	
		