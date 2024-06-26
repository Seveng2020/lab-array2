import java.util.Arrays;

public class PruebasEj4 {
    public static void main(String[] args) {
        int[] tabla = {1,1,2,3,5,4,4,10};
        int[] tabla2 = Ejercicio4.borrarRepetidos(tabla);


        for (int i = 0; i < tabla2.length; i++) {
            System.out.println(tabla2[i]);
        }
        if (tabla.length == tabla2.length) {
            System.out.println("ERROR");
        }else {
            System.out.println("PASS");
        }

        int[] tabla3 = {1,1,-2,-3,0,45,45,10,1,0};
        int[] tabla4 = Ejercicio4.borrarRepetidos(tabla3);
        for (int i = 0; i < tabla4.length; i++) {
            System.out.println(tabla4[i]);
        }
        long conteo = Arrays.stream(tabla3).distinct().count();
        int duplicados = tabla4.length - (int) conteo;
        if (duplicados == 0) {
            System.out.println("PASS");
        }else{
            System.out.println("ERROR");}



    }
}
