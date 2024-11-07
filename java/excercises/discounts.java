import java.util.Scanner;
public class discounts {
// Han empezado las rebajas en nuestra tienda de ropa y hace falta ajustar
// el sistema de cálculo del precio final de cada pieza. ¡Un montón de trabajo!
// Por suerte podemos hacer un algoritmo simple que nos simplificará
// el trabajo. Nuestra promoción es la siguiente: a todos los artículos les
// aplicamos un 25 % de descuento, pero si se compran más de tres piezas,
// entonces se aplica el 50 % a todas ellas. ¡Una ganga!
// Entendemos el problema
// Tenemos dos datos de entrada: el precio de compra y el número de
// artículos totales de la compra. Y, como salida, nos piden que calculemos
// el importe tras aplicar las rebajas.
// Pensamos cómo resolverlo
// Decidimos los cálculos a realizar para obtener lo que pide el enunciado:
// •
// El tipo de descuento es del 25 % si el número de productos es de 1
// a 3, y del 50 % si es de más de 3.
// •
// Importe descontado = importe x tipo de descuento.
// •
// Importe final: importe – importe descontado.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        final int Discount1 = 25;
        final int Discount2 = 50;
        
        double inicialimport; 
        double discountedimport;
        double  finalimport;
        int numofpieces;
        System.out.println("Write price" );
        inicialimport = input.nextDouble();
        System.out.println("numofpieces");
        numofpieces = input.nextInt();
       
        
        
        if (numofpieces <= 3){
            discountedimport = inicialimport * (Discount1/100.0);       
        } else {
            discountedimport = inicialimport * (Discount2/100.0);
        }

        finalimport = inicialimport - discountedimport;
        System.out.println("Result " + finalimport);
        input.close();
    }
    }