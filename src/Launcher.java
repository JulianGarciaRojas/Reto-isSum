public class Launcher {
    public static void main(String[] args) {
        // Declaración de la matriz sum, la cual será objeto de analisis para calcular las sumas correspondientes según las instrucciones dadas
        //String[] sum = {"1,2,3,6,8","1,1,1,8,9","3,3,11,0,6","1000,7,15,1,8","1004,3,3,3,14"};
        String[] sum = {"1,2,3,6,8","1,1,1,8,9","3,3,11,0,6","1000,7,15,2,8","1004,3,3,3,14"};
        //String[] sum = {"1,2,3","1,1,1","3,3,11","1000,7,15","1004,3,3"};
        //String[] sum = {"1,2,3,12","1,1,1,12","3,3,11,12"};

        Solver answer = new Solver();

        System.out.println(answer.isSum(sum)); // Impresión del resultado: true, si cumple con las condiciones; false en caso contrario
    }
}
