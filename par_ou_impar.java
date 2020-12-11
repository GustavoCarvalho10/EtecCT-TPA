import java.util.Scanner;

public class par_ou_impar
{
    public static void main(String[] args)
    {
        int numero,i;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        int num1 = 4;
        if(numero % 2==0)  
           System.out.println("par");
        else 
           System.out.println("impar");
        
       


    }
}
