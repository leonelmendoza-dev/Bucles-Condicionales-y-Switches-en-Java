//inicio el objeto scanner para obtener los datos del usuario
import java.util.Scanner;

public class sumaprimerosnumeros {
    
    //inicio el método main
public static void main(String[] args) {
    //inicio la instancia del scanner
     Scanner scanner = new Scanner(System.in);
     
     //declaro la variable suma y la inicializo en 0 esta cambiará su valor ya que se le irá sumando el valor que el usuario ingrese
     int suma = 0;


        //le indico al usuario que es lo que debe hacer
     System.out.println("Este programa sumará los primeros números según el numero que ingreses");
     System.out.println("para comenzar ingresa un número");

     //el usuario introduce el número que desea 

     int numero = scanner.nextInt();


        //acá se realiza la parte logica, la variable x se inicializa en 1 ya que este programa operará valores enteros
        //la variable x se compara con la variable numero, al determinar que x es igual a numero el programa sabrá que ya no debe seguir sumando
        //la variable x aumenta su valor con cada repetición para que al alcanzar el valor igual a la variable número se detenga
    for (int x = 1; x <= numero; x++){

        //cada repetición realiza la siguiente operación:
        // x inicia en 1 se compara a la variable numero si aún no es igual suma su valor a la variable suma y suma 1 a ella misma a fin de no exceder el valor que el usuario dió
        //la variable suma almacena el valor de sumarse ella misma a la variable x así, suma = suma + x, esto permite que cada vez que cambia de valor sume su valor actual a x 
        suma += x;
    }

    //al finalizar se le muestra al usuario el total de su suma
    System.out.println("La suma de los primeros, " + numero + " es: " + suma);
    //finalizo el objeto scanner
    scanner.close();

}


}
