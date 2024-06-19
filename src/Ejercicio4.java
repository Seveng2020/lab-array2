import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {

        int[] tabla = {1,1,2,3,5,4,4,10};
       // int[] tabla2 = borrarRepetidos(tabla);

        //for (int i = 0; i < tabla2.length; i++) {
        //    System.out.println(tabla2[i]);
        //}

        int[] tabla3 = {1,1,-2,-3,0,45,45,10,1,0};
        Ejercicio4.borrarRepetidos(tabla3);
        for (int i = 0; i < tabla3.length; i++) {
            System.out.println(tabla3[i]);
        }
    }
    public static int[] borrarRepetidos(int[] tabla) {
        Arrays.sort(tabla);
        int[] tabla2 = new int[tabla.length];
        int j = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (i == 0 || tabla[i] != tabla[i - 1]) {
                tabla2[j] = tabla[i];
                j++;
            }
        }int[]tabla3=Arrays.copyOfRange(tabla2,0,j);
        return tabla3;
    }
}
