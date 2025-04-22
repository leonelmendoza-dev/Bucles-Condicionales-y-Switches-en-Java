//importo el objeto scanner este me permitirá leer los datos que el usuario introduzca
import java.util.Scanner;


//creo la calse año bisiesto
public class añobisiesto {
   
    //creo la clase main para que mi aplicación pueda inicializarce
    public static void main(String[] args) {

        //creo la instancia para el scanner
        Scanner scanner = new Scanner(System.in);


        //indico al usuario par aque sirve la aplicación
        System.out.println("Hola! este programa te permitirá saber si un año es bisiesto o no");
        System.out.println("para comenzar ingresa el año que deseas saber si es bisiesto");

        //ingreso de datos por parte del usuario
        int año = scanner.nextInt();

        //parte lógica del programa acá se determinará si es un año bisiesto o no 

        //este if hace dos comparaciones si el residuo de dividirlo dentro de 4 es 0 entonces es divisible por 4
        //pero además debe cumplir esta otra condición si el residuo después de dividirlo entre 100 es diferente de cero entonces no es divisible por 100 por lo que es bisiesto
        // utilizo la condición O para que en caso de que el residuo de dividir el año en 400 sea 0 quiere decir que el año si es divisible en 400 por lo que es bisiesto

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {

            //muestro el resultado al usuario en caso de ser bisiesto
            System.out.println(año + ", es bisiesto");
                        
        } else {
            //en caso de no cumplir con ninguna de las 2 condiciones se muestra que el año no es bisiesto
            System.out.println(año + ", no es bisiesto");
        }

        //cierro el escanner para liberar recursos del sistema y evitar problemas con el flujo de entrada
        scanner.close();

    }

}
