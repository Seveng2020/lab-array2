import java.util.Arrays;

public class ChallengeExpenderDinero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calcularCantidadBilletes(3000, new int[]{2,0,3})));
        System.out.println(Arrays.toString(calcularCantidadBilletes(3000, new int[]{9,3,3})));
        System.out.println(Arrays.toString(calcularCantidadBilletes(72000, new int[]{9,3,3})));
        System.out.println(Arrays.toString(calcularCantidadBilletes(0, new int[]{9,3,3})));
        System.out.println(Arrays.toString(calcularCantidadBilletes(-45, new int[]{9,3,3})));


    }
    public static int[] calcularCantidadBilletes(int monto, int[] cantidadBilletesDisponibles) {
        int[] cantidadBilletesExpender = {0, 0, 0};
        int[] valoresBilletes = {500, 1000, 2000}; //podemos cambiarlo en el futuro
        int i = 2; // para que empiece desde el billete mas grande.


        // menajamos los errores con arrays de largo 1, con valores negativos:

        if(monto < 0){
            return new int[]{-1};
            // en caso de que sea monto negativo, devolvemos -1
        }

        if(monto == 0){
            return new int[]{-2};
            // en caso de que sea monto 0, devolemos -2
        }

        if (monto % 500 != 0) {
            return new int[]{-3} ;
            // en caso de que no sea multiplo, devolvemos -3
        }


        while(i>=0) {
            // recorremos 3 veces, 1 por cada valordebillete

            //mientras todavia me quede completar el monto
            // y tenga la cantidad de billetes de la denominacion (valor)
            while (monto >= valoresBilletes[i] && cantidadBilletesDisponibles[i] > 0) {
                //loopeamos aca dentro sumando billete a la salida
                // y restando de los disponibles
                cantidadBilletesExpender[i]++;
                cantidadBilletesDisponibles[i]--;
                //restamos el monto
                monto -= valoresBilletes[i];
            }
            //cambiamos a la denominacion adyacente menor
            i--;
        }

        // si recorri todas las denominaciones y todavia me queda monto quiere decir que no me alcanzaron
        // los billetes
        if (monto > 0) {
            return new int[] {-4};
        }
        // si sale bien:
        return cantidadBilletesExpender;
    }
}