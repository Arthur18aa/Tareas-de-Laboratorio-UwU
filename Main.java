import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

      double grados, resultado;

       System.out.println("\nHola\nBienvenido de nuevo\nEsta vez te ayudaré a convertir: \nGrados Centigrados a Grados Farenheit");
       
       System.out.println("\nIngresa el valor de los grados a convertir:");

        grados = entrada.nextInt();

         resultado = 32 + (9*grados/5);

        System.out.println("El resultado de la conversion es: " + resultado);

    }
}