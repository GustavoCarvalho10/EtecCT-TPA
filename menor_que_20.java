import java.util.Scanner;

public class menor_que_20
{
    public static void main(String[] args)
    {
        int num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        num1 = input.nextInt();


        if ((num1 > 20) )
            System.out.printf("N�mero maior que 20 �: %d"
                   ,
                    num1);



    }
}