import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int opcion;

        do{
            /**
             * llamo a la función menu
             * me muestra el menu
             * y con el switch me muestra cada opcion con su funcion
             */
            opcion=menu();
            switch (opcion){
                case 1:
                    System.out.println("1. Tabla de multiplicar");
                    dameNumero(opcion);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Saluda");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. Números primos");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4. Sumar n enteros");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("5. Multiplicar n enteros");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("6. Potencia");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("7. Pirámide");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("8. Fibonacci");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("9. Salir");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println();
            }

            /**
             * si el numero introducido es 9
             * no volver a mostrar el menu, es decir sale del programa
             */
        }while(opcion != 9);

    }

    /**
     * la funcion menú donde me irá mostrando el menú
     * @return
     */
    static int menu(){

        /**
         * declaro el scanner y la variable opcion
         */
        Scanner sc= new Scanner(System.in);
        int opcion;

        /**
         * bucle que me vaya mostrando el menú
         * si no se introduce el numero adecuado
         */
        do{
            System.out.println("Menú: ");
            System.out.println("1. Tabla de multiplicar");
            System.out.println("2. Saluda");
            System.out.println("3. Números primos");
            System.out.println("4. Sumar n enteros");
            System.out.println("5. Multiplicar n enteros");
            System.out.println("6. Potencia");
            System.out.println("7. Pirámide");
            System.out.println("8. Fibonacci");
            System.out.println("9. Salir");

            /**
             * pedimos al usuario el numero
             */
            System.out.print("Introduce una opción del menú: ");
            opcion=sc.nextInt();

            /**
             * si el numero introducido es menor que 1 o mayor que 9
             * volver a mostrar el menu
             */
        }while (opcion<1 || opcion>9);

        /**
         * que me devuelva la opcion marcada
         */
        return opcion;
    }
    static void dameNumero(int numero){
        /**
         * Declaro el scanner para que cuando se llame a este metodo
         * se vuelva a introducir un numero para mostrar la tabla de multiplicar
         */
        Scanner sc= new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero=sc.nextInt();

        /**
         * iniciando en 0 se vaya aumentando hasta llegar a 10
         * multiplicandolo con el numero introducido por el usuario
         */
        for (int i=0; i<=10; i++){
            System.out.println(numero + " x " + i + "= " + numero*i);
        }

    }
}
