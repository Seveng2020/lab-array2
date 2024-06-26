import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] billetes = {{2000, 0}, {1000, 0}, {500, 0}};

        System.out.println("Ingrese el monto a retirar(multiplo de 500):");
        int monto = sc.nextInt();

        if (monto < 500) {
            System.out.println("Monto invalido");
            return;
        }
        for (int i = 0; i < billetes.length; i++) {
            billetes[i][1] = monto / billetes[i][0];
            monto = monto % billetes[i][0];
        }

        for (int i = 0; i < billetes.length; i++) {
            System.out.println(billetes[i][1] + " billetes de $" + billetes[i][0]);
        }

        System.out.println("Monto restante: $" + monto);

        for (int i = 0; i < billetes.length; i++) {
            System.out.println(billetes[i][0]);
        }
    }
}
