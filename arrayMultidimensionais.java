import java.util.Arrays;

class Main{
    public static void main(String args[]){
        // cada chaves representa um colchetes dentro da variavel.
        String [][] moedas = {{"Dolar", "euro"},{"bitcoin", "ethereum"}};
        System.out.println(Arrays.deepToString(moedas)); 
    }
}