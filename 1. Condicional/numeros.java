//importo el objeto scanner, me permitirá obtener datos del usuario
import java.util.Scanner;

public class numeros {

    // inicio main para poder iniciar mi aplicación
    public static void main(String[] args) {
        
        //declaro la instancia del scanner
        Scanner scanner = new Scanner(System.in);

        //indico al usuario para que sirve mi aplicación
        System.out.println("Hola, este programa te permitirá evaluar si un número es positivo, negativo o cero");
        System.out.println("para comenzar ingresa un número a evaluar");

        //acá obtengo los datos del usuario y se almacenan en la variable numero
        int numero = scanner.nextInt();


        //mientras el número sea mayor a 0 será positivo
        if (numero > 0 ) 
        {
          System.out.println("El número que has ingresado es positivo");  
        }
        //en caso de ser menor que 0 será negativo 
        else if (numero < 0 )
        {
            System.out.println("El número que has ingresado es negativo");
        }
        //en cualquier otro caso será cero
        else 
        {
            System.out.println("El número ingresado es 0");
        }
        //finalizo el objeto scanner
        scanner.close();
    }
   
}


