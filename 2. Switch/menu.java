//importo el objeto scanner para obtener datos del usuario
import java.util.Scanner;
//importo el objeto localdate para obtener la fecha del día en que se ejecute el programa
import java.time.LocalDate;



public class menu {

    //declaro main para poder inicializar mi aplicación
    public static void main(String[] args) {
        
        //declaro la instancia del scanner
        Scanner scanner = new Scanner(System.in);



        //muestro las opciones del menú al usuario y le pido ingresar una opción
        System.out.println("POR FAVOR SELECCIONA UNA OPCION");
        System.out.println("1- MENSAJE DE BIENVENIDA");
        System.out.println("2- MOSTRAR FECHA ACTUAL");
        System.out.println("3- SALIR");

        //ingreso de datos por parte del usuario
        int opcion = scanner.nextInt();

        //acá se inicia un Switch que me permitirá cambiar de caso segun el valor que el usuario le de a la variable opcion
        switch (opcion) {
            case 1:
              System.out.println("HOLA! BIENVENIDO A ESTE CURSO, ES UN PLACER CONOCERTE, ESPERO QUE PODAMOS PASARNOSLA MUY BIEN JUNTOS");    

            break;

            case 2:
             //acá utilizo el objeto localdate para poder obtener la fecha actual de cuando se ejecute el programa
             LocalDate fecha = LocalDate.now();


             //el valor de localdate se muestra en la variable fecha
             System.out.println("LA FECHA ACTUAL ES: " +  fecha);

            break;

            case 3:
             System.out.println("SALIENDO...");
             System.exit(0);

            break;
        
            //en caso escoja una opción del menú que no exista el programa se finalizará automaticamente
            default:
             System.out.println("OPCION INCORRECTA");
            
        }
        //finalizo la instancia scanner
        scanner.close();

    }



    
}
