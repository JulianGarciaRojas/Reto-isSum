public class Solver {
    public boolean isSum(String[] matriz){
        int size = matriz.length;
        int[][] matrizInt = new int[size][size];
        int j = 0;
        int sumaH, sumaV, sumaO, casos = 0;

        if(size >= 4){
            for (String x: matriz) {
                String[] elements = x.split(",");
                if(elements.length == size){
                    for (int i = 0; i < size; i++) {
                        matrizInt[j][i] = Integer.parseInt(elements[i]);
                    }
                } else {
                    System.out.println("La matriz debe ser cuadrada (NxN)");
                    return false;
                }
                j++;
            }

            // Recorrido horizontal y vertical
            for (int i = 0; i < size; i++) {
                for (int k = 3; k < size; k++) {
                    sumaH = 0;
                    sumaV = 0;

                    for (int l = 1; l <= 3; l++) {
                        sumaH += matrizInt[i][k-l];
                        sumaV += matrizInt[k-l][i];
                    }

                    if (sumaH == matrizInt[i][k]){
                        casos++;
                    }
                    if (sumaV == matrizInt[k][i]){
                        casos++;
                    }
                }
            }

            // Recorrido Oblicuo
            for (int i = 3; i < size; i++) {
                for (int k = 3; k < size; k++) {
                    sumaO = 0;

                    for (int l = 1; l <= 3; l++) {
                        sumaO += matrizInt[i-l][k-l];
                    }

                    if (sumaO == matrizInt[i][k]){
                        casos++;
                    }
                }
            }

            System.out.println(casos);

        } else {
            System.out.println("El array debe tener mínimo un tamaño de 4x4 para cumplir con las condiciones del ejercicio");
            return false;
        }

        if (casos >= 3){
            return true;
        } else {
            return false;
        }
    }
}
