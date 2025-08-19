import java.util.Scanner;
public class CalculadoraB {
    Scanner leer = new Scanner(System.in);
    System.out.println("***");
    System.out.println("Calculadora");
    System.out.println("*****");
    System.out.println("Operaciones:\n1) Suma \n2) Resta\n3) Multiplicacion\n4) Division");
    int opcion = leer.nextInt();



    double Resultado, valor1, valor2;

    switch(opcion){

        case1://Suma
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 + valor2;

        System.out.println("Resultado: " + Resultado):
        break;



        case2://Resta
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 - valor2;

        System.out.println("Resultado: " + Resultado):
        break;


          case3://Multiplicacion
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 * valor2;

        System.out.println("Resultado: " + Resultado):
        break;


          case4://Division
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 / valor2;

        System.out.println("Resultado: " + Resultado):
        break
    }
}