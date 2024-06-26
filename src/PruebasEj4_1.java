public class PruebasEj4_1 {
    public static void main(String[] args) {
        int[] tabla = {1,7,2,3,5,4,6,10};
        int[] pares = Ejercicio4_1.arrayPares(tabla);
        int[] impares = Ejercicio4_1.arrayImpares(tabla);

        if (pares.length == 4 && impares.length == 4) {
            System.out.println("PASS");
        } else {
            System.out.println("ERROR");
        }

        if (pares[2]== 6 && impares[2]==3) {
            System.out.println("PASS");
        } else {
            System.out.println("ERROR");
        }
    }
}
