// Os arrays são estruturas que servem para guardar dados, e organizá-los.

import java.util.Arrays;

class Main{
    public static void main(String args[]){
        int[] valores = {50, 40, 30, 20, 10};
        // Arrays.sort - Organiza a variavel de fornma númerica
        Arrays.sort(valores);
        //Arrays.to - classe (Arrays.toString ou toDouble são metodos dentro da classe Arrays)
        System.out.println(Arrays.toString(valores));
        // length - mostra a quantidade de itens dentro da variavel, o tamanho da array
        System.out.println(valores.length);
    }
}