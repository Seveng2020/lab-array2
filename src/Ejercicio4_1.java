import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad=0;
        System.out.println("Digite la cantidad de numeros a ingresar: ");
        cantidad = sc.nextInt();
        int[] n=new int[cantidad];

        for (int i = 0; i <cantidad ; i++) {
            System.out.println("Ingrese el numero "+(i+1)+": ");
            n[i] = sc.nextInt();
        }
        
        int[] pares = arrayPares(n);
        for (int i = 0; i < pares.length; i++) {
            System.out.println("El numero "+pares[i]+" es par");
        }
        int[] impares = arrayImpares(n);
        for (int i = 0; i < impares.length; i++) {
            System.out.println("El numero "+impares[i]+" es impar");
        }




    }

    public static int[] arrayPares(int[] tabla) {
        Arrays.stream(tabla)
                .filter(num->num%2==0)
                .toArray();
        return tabla;
    }

    public static int[] arrayImpares(int[] tabla) {
        Arrays.stream(tabla)
                .filter(num->num%2!=0)
                .toArray();
        return tabla;
        
    }
}
