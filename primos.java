import java.util.Scanner; 

public class primos {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	int numDivisores = 0;
	int numPrimo;
	
	System.out.println("Digite um numero:");
	numPrimo = leitor.nextInt();
	
	for(int i = 1; i <= numPrimo; i++) {
		
		if(numPrimo % i == 0){
			numDivisores++;
		}
	}	
		if(numDivisores == 2) {
			System.out.println("O n�mero digitado � primo");
		} else {
			System.out.println("O n�mero digitado n�o � primo");
		}
		}
	}

