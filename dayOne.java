// > Package
import java.util.Scanner;
// > Class 
class Main{
    // > Method+
    public static void main (String args[]){
        // > Statements 
        Scanner input = new Scanner(System.in);
        // final print mantem a resposta na mesma linha, já o println a resposta do usuario fica na proxima
        System.out.print("Digite um número: " );
        int numberOne = input.nextInt();
        System.out.print("Digite outro número: " );
        int numberTwo = input.nextInt();
        // sout + table é um atalho para System.out.println
        System.out.print("Sua soma é " + (numberOne + numberTwo));
        input.close();
    }
}