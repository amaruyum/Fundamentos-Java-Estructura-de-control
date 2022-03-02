
package estructurascontrol;

import java.util.Scanner;

public class SistemaCalificacion {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            double nota;
            System.out.print("Ingrese un valor entre 0 y 10: ");
            nota = sc.nextDouble();
            if(nota >= 0 && nota < 6){
                System.out.println("F");
            }else if(nota <= 7){
                System.out.println("D");
            }else if(nota<=8){
                System.out.println("C");
            }else if(nota<=9){
                System.out.println("B");
            }else if(nota<=10){
                System.out.println("A");
            }else {
                System.out.println("Valor Desconocido");
            }
        }
}
