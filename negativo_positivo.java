import java.util.Scanner;

public class negativo_positivo
{
    public static void main(String[] args)
    {
        int num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        num1 = input.nextInt();


        if ((num1 > 0) )
            System.out.printf("N�mero positivo %d"
                   ,
                    num1);

        if ((num1 < 0) ) 
                  System.out.printf("N�mero negativo %d"
                		  ,
                    num1);



    }
}