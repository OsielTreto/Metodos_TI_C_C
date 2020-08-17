package ejercicios.simulacion.unidad.pkg3;

import java.util.*;
import java.io.*;

/**
 *
 * @author OsielAlejandro
 */
public class EjerciciosSimulacionUnidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion1 = 0, opcion2;

        do {
            System.out.println("\nSeleccione un metodo "
                    + "\n 1 - Metodo transformada inversa "
                    + "\n 2 - Metodo de convolucion "
                    + "\n 3 - Metodo de composicion"
                    + "\n 4 - Salir");
            opcion1 = teclado.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("\n===Metodo transformada inversa===");
                    System.out.println("Elija un metodo "
                            + "\n1 - Distribucion uniforme "
                            + "\n2 - Distribucion exponencial "
                            + "\n3 - Regresar");
                    opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("----Distribucion uniforme----");
                            int n,
                             a,
                             b;
                            double resX;
                            System.out.println("Ingrese el valor de A");
                            a = teclado.nextInt();
                            System.out.println("Ingrese el valor de B");
                            b = teclado.nextInt();

                            System.out.println("Ingrese el numeor de medicion");
                            n = teclado.nextInt();
                            double array[] = new double[n];
                            double arrayRES[] = new double[n];
                            System.out.println("Ingrese los valores de ri");
                            for (int i = 0; i < n; i++) {
                                array[i] = teclado.nextDouble();
                            }

                            for (int i = 0; i < n; i++) {
                                resX = a + ((b - a) * array[i]);
                                arrayRES[i] = resX;

                            }

                            System.out.println("=|=|=|= RESULTADO =|=|=|=");
                            for (int i = 0; i < n; i++) {
                                System.out.println((i + 1) + " r" + (i + 1) + " = " + array[i] + " x" + (i + 1) + " = " + arrayRES[i]);
                            }

                            break;
                        case 2:
                            System.out.println("----Distribucion exponencial----");
                            int n2;

                            System.out.println("Ingrese el numero de medicion");
                            n2 = teclado.nextInt();
                            double array2[] = new double[n2];
                            double arrayRES2[] = new double[n2];
                            System.out.println("Ingrese los valores de ri");
                            for (int i = 0; i < n2; i++) {
                                array2[i] = teclado.nextDouble();
                            }
                            //FALTA AGREGAR LOGARITOMO NATURAL
                            for (int i = 0; i < n2; i++) {
                                resX = -3 * Math.log(1 - array2[i]);
                                arrayRES2[i] = resX;
                            }

                            System.out.println("=|=|=|= RESULTADO =|=|=|=");
                            for (int i = 0; i < n2; i++) {
                                System.out.println((i + 1) + " r" + (i + 1) + " = " + array2[i] + " x" + (i + 1) + " = " + arrayRES2[i]);
                            }
                            break;

                        case 3:
                            break;

                    }

                    break;
                case 2:
                    System.out.println("\n===Metodo de convolucion===");
                    System.out.println("Elija un metodo "
                            + "\n1 - Distribucion de erlang "
                            + "\n2 - Distribucion normal "
                            + "\n3 - Distribucion binomial "
                            + "\n4 - regresar");
                    opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            int nerlang,
                             num,media;
                            System.out.println("----Distribucion de erlang----");
                            System.out.println("Ingrese el numero de erlang");
                            nerlang = teclado.nextInt();
                            System.out.println("Ingrese la media");
                            media=teclado.nextInt();
                            System.out.println("Ingrese el valor de i");
                            num = teclado.nextInt();

                            double arrayFINAL[] = new double[num];
                            double matriz[][] = new double[num][nerlang];

                            for (int i = 0; i < num; i++) {
                                for (int j = 0; j < nerlang; j++) {
                                    matriz[i][j] = teclado.nextDouble();
                                }
                            }
                            double aux1 = 1,aux2;
                            for (int i = 0; i < num; i++) {
                                for (int j = 0; j < nerlang; j++) {
                                    aux1 = matriz[i][j] * aux1;
                                    
                                    if (j==nerlang) {
                             aux2=((media/nerlang)*-1)*(Math.log(aux1));
                                        arrayFINAL[i]=aux2;
                                        aux1=1;
                                    }
                                }
                            }

                            break;

                        case 2:
                            System.out.println("----Distribucion normal----");
                            int n3;
                            double resX4,
                             OA,
                             M;
                            System.out.println("Ingrese el valor de O");
                            OA = teclado.nextDouble();
                            System.out.println("Ingres el valor de M");
                            M = teclado.nextDouble();
                            System.out.println("Ingrese el valor de i");
                            n3 = teclado.nextInt();
                            double arrayRI[] = new double[n3];
                            double arrayRI6[] = new double[n3];
                            double arrayFIN[] = new double[n3];
                            System.out.println("Ingrese los valores de la sumatoria ri");
                            for (int i = 0; i < n3; i++) {
                                arrayRI[i] = teclado.nextDouble();
                            }
                            for (int i = 0; i < n3; i++) {
                                arrayRI6[i] = (arrayRI[i] - 6);
                            }

                            for (int i = 0; i < n3; i++) {
                                resX4 = (arrayRI6[i] * OA) + M;
                                arrayFIN[i] = resX4;
                            }

                            System.out.println("=|=|=|= RESULTADO =|=|=|=");
                            for (int i = 0; i < n3; i++) {
                                System.out.println(
                                        " sumatoria r" + (i + 1) + " = " + arrayRI[i]
                                        + " sumatoria (r" + (i + 1) + " - 6)" + (i + 1) + " = " + arrayRI6[i]
                                        + " resultado = " + arrayFIN[i]);
                            }

                            break;

                        case 3:
                            System.out.println("----Distribucion binomial----");

                            break;
                        case 4:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("\n===Metodo de composicion===");

                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion1 != 4);

    }
}
