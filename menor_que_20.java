import java.util.Scanner;

public class menor_que_20
{
    public static void main(String[] args)
    {
        int num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = input.nextInt();


        if ((num1 > 20) )
            System.out.printf("Número maior que 20 é: %d"
                   ,
                    num1);



    }
}