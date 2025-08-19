import java.util.Scanner;



public class invertirCadena {
    public static void main(String[] args){

        Scanner ValorC = new Scanner(System.in);
        System.out.print("Escriba cualquier texto");
        String texto = ValorC.nextLine();

        String invertir = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido:" + invertir);

        ValorC.close();
    }
}