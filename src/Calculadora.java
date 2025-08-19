import java.util.Scanner;
public class CalculadoraB {
    Scanner leer = new Scanner(System.in);
    System.out.println("Calculadora");
    System.out.println("Operaciones:\n1) Suma \n2) Resta\n3) Multiplicacion\n4) Division");
    int opcion = leer.nextInt();




    
    double Resultado, valor1, valor2;

    switch(opcion){


      // ESTA PRIMERA OPCION SERA LA SUMA
        case1:
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 + valor2;

        System.out.println("Resultado: " + Resultado):
        break;



        // ESTA PRIMERA OPCION SERA LA RESTA
        case2:
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 - valor2;

        System.out.println("Resultado: " + Resultado):
        break;


        // ESTA PRIMERA OPCION SERA LA MULTIPLICACION
          case3:
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 * valor2;

        System.out.println("Resultado: " + Resultado):
        break;



        // ESTA PRIMERA OPCION SERA LA DIVISION
          case4:
        System.out.println("Primer Valor");
        valor1 = leer.nextDouble();

        System.out.println("Segundo Valor");
        valor2 = leer.nextDouble();

        Resultado = valor1 / valor2;

        System.out.println("Resultado: " + Resultado):
        break
    }
}