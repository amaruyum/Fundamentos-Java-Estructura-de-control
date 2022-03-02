package estructurascontrol;

public class EstructurasControl {

    public static void main(String[] args) {
        var condicion = false;

        if (condicion) {
            System.out.println("condicion = " + condicion);
            System.out.println("Nueva linea de condigo");
        } else {
            System.out.println("condicion Falsa");
        }
        
       var numero = 5;
       var numeroTexto = "Numero Desconocido";
       
       if(numero == 1){
           numeroTexto = "numero uno";
       }else if (numero == 2){
           numeroTexto = "numero dos";
       }else if (numero == 3){
           numeroTexto = "numero tres";
       }else if (numero == 4){
           numeroTexto = "numero cuatro";
       }else {
           numeroTexto = "Numero no encontrado";
       }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
