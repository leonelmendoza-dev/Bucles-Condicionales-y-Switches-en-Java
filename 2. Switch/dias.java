//incio el objeto scanner para obtener datos del usuario
import java.util.Scanner;

//inicio mi clase principal
public class dias {

    //inicio el metodo main para poder iniciar mi aplicación
    public static void main(String[] args) {

        //inicio la instancia del scanner
        Scanner scanner = new Scanner(System.in);

        //explicación de lo que realiza la aplicación
        System.out.println("Este programa te permitirá saber que día de la semana es según el número que introduzcas");
        System.out.println("para comenzar ingresa un número del 1 al 7 ");

        //ingreso de datos por parte del usuario
        int dia = scanner.nextInt();

        //inicio un switch que me permitirá cambiar de caso según el valor que el usuario le de a la variable dia
        //el valor que se le asigne a la variable dia, se evalúa en esta parte y muestra el caso cada caso tiene un día de la semana asignado
        switch (dia) {
            case 1:
             System.out.println("Ese número pertenece al día Lunes");
                
            break;

            case 2:
             System.out.println("Ese número pertenece al día Martes");

            break;

            case 3:
             System.out.println("Ese número pertenece al día Miercoles");

             break;

            case 4:
             System.out.println("Ese número pertenece al día Jueves");

            break;

            case 5:
             System.out.println("Ese número pertenece al día Viernes");

            break;

            case 6:
             System.out.println("Ese número pertenece al día Sábado");

            break;

            case 7:
              System.out.println("Ese número pertenece al día Domingo");
            
            break;

            //cada semana solo tiene 7 días por lo que los valores aceptados son de 1 a 7 en caso de introducir un valor diferente a esos valores devolverá el mensaje de valor inválido
            default:
            System.out.println("Número no válido");
        }


        //finalizo el objeto scanner para liberar recurso 
        scanner.close();

    }
    



}
