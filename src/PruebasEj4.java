import java.util.Arrays;

public class PruebasEj4 {
    public static void main(String[] args) {
        int[] tabla = {1,1,2,3,5,4,4,10};
        int[] tabla2 = Ejercicio4.borrarRepetidos(tabla);
        boolean pruebas = true;

        for (int i = 0; i < tabla2.length; i++) {
            System.out.println(tabla2[i]);
        }
        if (tabla.length == tabla2.length) {
            pruebas = false;
        }
        System.out.println(pruebas);

        int[] tabla3 = {1,1,-2,-3,0,45,45,10,1,0};
        int[] tabla4 = Ejercicio4.borrarRepetidos(tabla3);
        for (int i = 0; i < tabla4.length; i++) {
            System.out.println(tabla4[i]);
        }
        long conteo = Arrays.stream(tabla3).distinct().count();
        int cantconteo = tabla4.length - (int) conteo;
        if (cantconteo == 0) {
            pruebas = true;
        }else{
            pruebas =false;}
        System.out.println(pruebas);

        int[] tabla5 = {1,2,2,3,0,-1003246578,999999999,12346578,0000,-0,-555,-555,-3,-3};
        int [] tabla6 = Ejercicio4.borrarRepetidos(tabla5);

        for (int i = 0; i < tabla6.length; i++) {
            System.out.println(tabla6[i]);
        }
        long conteo2 = Arrays.stream(tabla5).distinct().count();
        int cantconteo2 = tabla6.length - (int) conteo2;
        if (cantconteo2 == 0) {
            pruebas = true;
        }else{
            pruebas =false;}
        System.out.println(pruebas);


    }
}
