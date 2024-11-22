package java_.arrays;
public class arrayTabla {
    public static void main(String[] args){
        int[][] n = new int [3][2];

        n[0][0] = 20;
        n[0][1] = 12;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;
        n[2][0] = 5;

        int fila;
        int columna;

        for(fila = 0; fila < 3; fila++){
            System.out.print("Fila: " + fila);
            for(columna = 0; columna < 2; columna++){
                System.out.printf("%5d ", n[fila][columna]);
            }
            System.out.println();
        }

    }

}