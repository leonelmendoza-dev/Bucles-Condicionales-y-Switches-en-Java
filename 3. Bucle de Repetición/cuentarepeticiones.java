//importo el objeto scanner este me permitirá leer los datos que el usuario introduzca
import java.util.Scanner;

//creo la clase cuenta repeticiones
public class cuentarepeticiones {

    //creo la clase main para que mi programa pueda ejecutarse
    public static void main(String[] args) {
        
        //declaro la instancia del scanner ya que me permitirá recaudar datos del usuario.
        Scanner scanner = new Scanner(System.in);



          //la variable repetición me permitirá llevar la cuenta de las veces que el usuario ha visto el mensaje
          int repeticion = 0;
  


    
           //Le explico al usuario para que sirve el programa
           System.out.println("Este programa contará las veces que veas el mensaje");
          

           

                 

           //utilizo un bucle para que en caso de que el resultado de la operación sea falso el programa pueda detenerse
        while (true) {

            //le indico al usuario que debe pulsar 1 para seguir viendo el mensaje
            System.out.println("para ver el mensaje presiona 1, al mostrarse te preguntará si deseas verlo de nuevo, presiona 1 para verlo nuevamente");
             int opcion = scanner.nextInt();

             //en esta parte mientras el usuario siga introduciendo 1 va a seguir viendo el mensaje "Hola", he puesto == para que sea exactamente uno y en caso de que sea un número menor o mayor finalicé el programa
            if (opcion == 1) {

                //cada vez que el usuario ve el mensaje a la variable repetición se le suma 1 esto me permitirá mostrar al usuario las veces que ha visto el mensaje
                repeticion ++;

                //muestro el mensaje al usuario
                System.out.println("HOLA");
                //le indico cuantas veces lo ha visto y que presione 1 para seguirlo viendo 
                System.out.println("Lo has visto, " + repeticion + " veces");
                System.out.println("Si deseas verlo de nuevo presiona 1 si no presiona cualquier otra tecla");
                
            } 
            else
            {
                //en caso de que introduzca un número diferente a 1 verá el mensaje de finalización de la aplicación
                System.out.println("Finalizando...");
                //pongo un break para que salga inmediatamente del bucle
                break;

            }

            
    

                       
        }
        //al finalizar le mostrará la cantidad de veces que vió el mensaje y cerrará el programa
        System.out.println("el mensaje fue visto " + repeticion + " veces");
        scanner.close();

       
      


    }


    
}
