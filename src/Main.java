import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        int num, num2;
        int grado[], mostrar[], g[];
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de estudiantes"));
        Scanner entrada = new Scanner(System.in);
        float edad[] = new float[num];

        boolean creciente = false, decreciente = false;

        float suma_mayor = 0, suma_menor = 0, media_mayor, media_menor, promedio = 0;
        int conteo_mayor = 0, conteo_menor = 0, conteo_igual = 0;

        for (int i = 0; i < num; i++) {

            System.out.println((i + 1) + " digite la edad");
            edad[i] = entrada.nextFloat();

            if (edad[i] == 5) {
                conteo_igual++;
            }
            if (edad[i] >= 5) {
                suma_mayor += edad[i];
                promedio = promedio / suma_mayor;
                conteo_mayor++;
            }
            if (edad[i] < 5) {
                suma_menor += edad[i];
                conteo_menor++;
            }

        }
        if (conteo_igual == 5) {
            System.out.println("no se puede calcular la cantidad de niños  menores de 5 años");
        } else {
            System.out.println(" niños edad igaul a 5 años son: " + conteo_igual);
        }
        if (conteo_mayor == 5) {
            System.out.println(" no se puede calocular la cantidad de niños que son menores de 5 años");
        } else {
            promedio = suma_mayor / conteo_mayor;
            System.out.println("promedio de niños que son mayores a 5 son: " + promedio);

        }
        if (conteo_menor == 5) {
            System.out.println("no se puede saber la cantidad de niños que son menores de 5 años  ");
        } else {
            media_menor = suma_menor / conteo_menor;
            System.out.println(" media de niños que son menores de 5 años son: " + media_menor);
        }

        num2 = num * 2;
        grado = new int[num];
        edad = new float[num];
        mostrar = new int[num2];

        for (int i = 0; i < num; i++) {
            System.out.println( " Digite de nuevo la edad del estudiante  ");
            edad[i] = entrada.nextInt();
        }
        for (int i = 0; i > num; i++) {
            System.out.println( (i + 1) + " digite el grado del estudiante");
            grado[i] = entrada.nextInt();
        }

        int j=0;
        for ( int i=0;i<num; i++) {
            mostrar[j] = (int) edad[i];
            j++;
            mostrar[j] =  grado[i];
            j++;


        }

        System.out.println( " edad      grado");
        for (int i=0; i< num;i++)

        System.out.print(mostrar  [i]+ "     " );





/*

    int arreglo []= new int [num];
    for ( int i=0; i<num; i++) {
    System.out.println((i+1)+" digite el grado");
    arreglo [ i]= scanner.nextInt();
    }

     for (int i=0; i< num;i++){
     if ( arreglo[i]  < arreglo [i+1]){
         creciente = true;
     }
         if (arreglo [i] > arreglo [i+1]){
                 decreciente= true;
         }

     }*/


    }
}