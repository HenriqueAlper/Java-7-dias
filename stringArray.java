import java.util.Arrays;
class Main {
    public static void main (String args[]){
    // String - Variavel p/ texto.
    String[] cars = {"Santana 99", "EcoSport titanium", "HondaFit", "Corolla", "HondaCivic"};
    // variavel[] = "" / Trocar um item da lista.
    cars[3] = "SW4";
    System.out.println(Arrays.toString(cars));
    // Arrays trabalham com o sistema de index, começando todas contagens apartir do 0.
    System.out.println(cars[3]);

    }
        
}
