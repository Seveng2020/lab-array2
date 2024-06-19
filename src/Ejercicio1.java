import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grupo = new int[5][3];
        int suma=0;
        int alumno=0;
        double promedio=0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota del Trimestre Nª: "+(j+1) +" Del Alumno N°: "+(i+1));
                System.out.print("Nota: ");
                grupo[i][j]= sc.nextInt();
                suma += grupo[i][j];
            }

        }
            promedio= (double)suma/5;
            System.out.println("El promedio de notas del grupo es: "+promedio);

            int suma2=0;
            System.out.print("Indique el N° del alumno que desea ver el promedio: ");
            alumno = sc.nextInt()-1;
        for (int k = 0; k < 3; k++) {
            suma2 += grupo[alumno][k];
        }
            double promedio2 = (double) suma2 /3;
            System.out.println("El Promedio del alumno es de: "+promedio2);



    }
}