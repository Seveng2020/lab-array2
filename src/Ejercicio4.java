import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] tabla = {1,1,2,3,5,4,4,10};
        int[] tabla2 = borrarRepetidos(tabla);
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println(tabla2[i]);
        }
    }
    public static int[] borrarRepetidos(int[] tabla) {
        int[] tabla2 = tabla;
        Arrays.sort(tabla2);
        int[] tabla3 = new int[tabla2.length];
        int j = 0;
        for (int i = 0; i < tabla2.length; i++) {
            if (i == 0 || tabla2[i] != tabla[i - 1]) {
                tabla3[j] = tabla2[i];
                j++;
            }
        }int[]tabla4=Arrays.copyOfRange(tabla3,0,j);
        return tabla4;
    }
}
