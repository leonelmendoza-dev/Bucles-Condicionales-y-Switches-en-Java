//importo el objeto scanner para almacenar los datos del usuario 
import java.util.Scanner;


public class sumanumeros {

    //inicio el metodo main
    public static void main(String[] args) {
        
        //declaro la instancia del scanner
        Scanner scanner = new Scanner(System.in);

        //declaro la variable suma y la inicializó en 0 esta variable almacenará la suma el valor de las sumas que vaya realizando el usuario
        int suma = 0;
        //la variable numero1 la inicializó en 0 ha esta variable se le asignará el valor que introduzca el usuario y luego se sumará con la variable suma
        int numero1 = 0;
        //Le indico al usuario como funciona la aplicación
        System.out.println("Este programa sumará cada vez que ingreses un número pero si ingresas un número negativo dejará de sumar");

       

        //este While me permitirá que el bucle continúe hasta que el valor que introduzca el usuario se negativo es decir menor que 0
        while (numero1 >= 0 ) {

            //acá se piden datos al usuario y el usuario ingresa los datos
            System.out.println("Ingresa un numero: ");
            
            numero1 = scanner.nextInt();

            //declaro una sentencia que me permite evaluar el valor que el usuario le dio a la variable 1 este valor debe ser mayor o igual a cero si es menor finaliza la suma
            if (numero1 >=0) {


                //acá realizo la suma el operador += me permite qye la variable suma tome el valor que ya tiene más la variable suma, así: suma =suma+numero1
                //mientras numero1 no sea menor que 0 es decir negativo el bucle continuará
                suma += numero1;
                
            }

                       
        }
        
        //en caso el usuario introduzca un número negativo le dirá de cuanto fue toda la suma y finalizará el programa
        System.out.println("La suma es: " + suma);
        //finalizo el objeot scanner
        scanner.close();




    }



}
