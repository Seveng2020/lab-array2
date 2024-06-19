import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[6];
        int[] tabla2 = new int[6];
        int[] tabla3 = new int[12];
        int mayor=0;
        int menor=0;
        System.out.print("Ingrese Los 6 numeros de la primer tabla: ");
        for (int i = 0; i < tabla1.length; i++) {
            tabla1[i] = sc.nextInt();
        }ordenarBurbuja(tabla1);


        System.out.print("Ingrese los 6 numeros de la segunda tabla: ");
        for (int j = 0; j < tabla2.length; j++) {
            tabla2[j] = sc.nextInt();
        }ordenarBurbuja(tabla2);

        int t1=0,t2=0,t3=0;

        for (; t1 < tabla1.length && t2 < tabla2.length; t3++) {
            if (tabla1[t1] < tabla2[t2]) {
                tabla3[t3] = tabla1[t1];
                t1++;
            } else {
                tabla3[t3] = tabla2[t2];
                t2++;
            }

        }

            for (; t1 < tabla1.length; t1++,t3++) {
            tabla3[t3]=tabla1[t1];
            }
            for (; t2 <tabla2.length ; t2++,t3++) {
            tabla3[t3]=tabla2[t2];
            }

        for (int o = 0; o < tabla3.length; o++) {
            System.out.println("Tabla fusionada y ordenada: "+tabla3[o]);

        }


    }

    public static void ordenarBurbuja(int[] array) {
        final int LONG = array.length;
        boolean orden = false;
        for (int i = 0; i < LONG - 1; i++) {
            orden = false;
            for (int j = 0; j < LONG - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    orden = true;
                }

            }
            if (!orden) {
                break;
            }
        }
    }
}