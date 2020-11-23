import java.util.Scanner;
import java.util.*;
import java.io.*;

public class circun{

    public static void main(String[] args)throws IOException{

        Scanner entrada = new Scanner(System.in);

        double area, perimetro, radio;

        System.out.println("\nHola\nBienvenido de nuevo\nEsta vez te ayudaré a: \nSacar el Área y Perímetro de un Circulo");
       
        System.out.println("\nIngresa el valor del radio para iniciar:");

          radio = entrada.nextInt();

          area = 3.1416*(radio*radio);

          perimetro = 2*3.1416*radio;

        System.out.println("A continuacion te dare los resultados:");
        System.out.println("\nEl tamaño del area es de: "+area+ "\nEl tamaño del perimetro es de: "+perimetro);

    }

}