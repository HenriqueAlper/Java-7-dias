import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int numberOne = input.nextInt();
        System.out.println("Digite outro número: ");
        int numberTwo = input.nextInt();
        System.out.println("Seu resultado é " + (numberOne + numberTwo));
       input.close();
    }
}