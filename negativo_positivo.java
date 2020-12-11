import java.util.Scanner;

public class negativo_positivo
{
    public static void main(String[] args)
    {
        int num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = input.nextInt();


        if ((num1 > 0) )
            System.out.printf("Número positivo %d"
                   ,
                    num1);

        if ((num1 < 0) ) 
                  System.out.printf("Número negativo %d"
                		  ,
                    num1);



    }
}