// A classe Math define constantes e métodos usualmente presentes em uma biblioteca de rotinas matemáticas.
class Main {
    public static void main(String args[]){
        // Math.round - O metodo "round" arredonda um numero quebrado para inteiro de acordo com a sua proximidade, por exemplo o numero que está antes de 0.5 é arredondado para 0.0 e o que está depois disso é arredondado para 1.0.
        double value = Math.round(10.4);
        // Math.ceil - Arredonda para o numero superior 
        double valueTwo = Math.ceil(4.1);
        // Math.floor - Arredonda para o numero abaixo
        double valueThree = Math.floor(7.9);
        // Math.random - Gera números aleatórios de 0.0 até 1.0, geralmente usado para sorteios
        // Math.random() * (numero qualquer) - Será gerado números de 0.0 até o numero qualquer que você definir
        double valueFour = Math.random();
        System.out.println(value);
        System.out.println(valueTwo);
        System.out.println(valueThree);  
    }
    
}
