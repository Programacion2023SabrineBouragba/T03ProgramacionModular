import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args){
        int opcion;
        int numero;

        do{
            /*llamo a la función menu me muestra el menu
              y con el switch me muestra cada opcion con su funcion*/
            opcion= mostrarmenu();
            switch (opcion){
                case 1:
                    System.out.println("Tabla de multiplicar");
                    numero=dameNumero();
                    mostrarTablaMultiplicar(numero);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Saludos");
                    String nombre=dameNombre();
                    numero=dameNumero();
                    mostrarsaludo(nombre, numero);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Números primos");
                    numero=dameNumero();
                    boolean esPrimo= esPrimo(numero);
                    System.out.println("¿Es el número " + numero + " primo? " + esPrimo);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Sumar n enteros");
                    numero=dameNumero();
                    int suma=sumarNEnteros(numero);
                    System.out.println("La suma de los " + numero + " números primeros es de: " + suma);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Multiplicar n enteros");
                    numero=dameNumero();
                    int multiplicacion=multiNEnteros(numero);
                    System.out.println("El producto de los " + numero + " números primeros es de: " + multiplicacion);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Potencia");
                    numero=dameNumero();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Pirámide");
                    numero=dameNumero();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Fibonacci");
                    numero=dameNumero();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println();
            }

            /*si el numero introducido es 9
            no volver a mostrar el menu, es decir sale del programa*/
        }while(opcion != 9);

    }

    /**
     * la funcion menú donde me irá mostrando el menú
     */
    static int mostrarmenu(){

        /*declaro el scanner y la variable opcion*/
        Scanner sc= new Scanner(System.in);
        int opcion;

        /*bucle que me vaya mostrando el menú
        si no se introduce el numero adecuado*/
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

            /*pedimos al usuario el numero
             si el numero introducido es menor que 1 o mayor que 9
             volver a mostrar el menu*/
            System.out.print("Introduce una opción del menú: ");
            opcion=sc.nextInt();

        }while (opcion<1 || opcion>9);

        return opcion;
    }
    static int dameNumero() {

        /*Declaro el scanner para que cuando se llame a este metodo
         se vuelva a introducir un numero para mostrar la tabla de multiplicar*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        return sc.nextInt();
    }
    static void mostrarTablaMultiplicar(int numero){
        /*iniciando en 0 se vaya aumentando hasta llegar a 10
         multiplicandolo con el numero introducido por el usuario*/
        for (int i=0; i<=10; i++){
            System.out.println(numero + " x " + i + "= " + numero*i);
        }
    }

    /**
     * creo dame nombre para utilizar en metodo saluda
     */
    static String dameNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        return sc.next();
    }

    static void mostrarsaludo(String nombre, int numero){
        //iniciando en 0, aumentar imprimiendo saludo hasta llegar al maximo
        for(int i=0; i<numero; i++){
            System.out.println("Hola " + nombre);
        }
    }

    /**
     * creamos metodo para verificar si el numero introducido es primo o no
     */
    static boolean esPrimo(int numero){
        //declaracion de variables
        int modulo=0;
        int contPrimo=0;

        //si el num es igual a 1, es primo
        if(numero==1){
            return true;

        //sino, empezar esta condicion
        }else if (numero!=0){
            /*para iniciador de division entre el numero introducido
            iniciamos en 2 y vamos aumnetando hasta llegar al numero introducido
            vamos verificando el modulo de cada division hecha
            si el modulo es 0, lo almacenamos en conPrimo
            finalmente si este contador es igual a uno, quiere decir
            que el num introducido solo es divisible por sí mismo
             */
            for(int i=2; i<=numero; i++){
                modulo=numero%i;

                if(modulo==0){
                    contPrimo++;
                }
            }
            if(contPrimo==1){
                return true;
            }
        }
        //si no se cumple nada anterior, devolver valor falso
        return false;
    }

    static int sumarNEnteros(int numero){
        int suma=0;
        for(int i=1; i<=numero; i++){
            suma+=i;
        }
       return suma;
    }

    static int multiNEnteros(int numero){
        int multiplicacion=1;
        for(int i=1; i<=numero; i++){
            multiplicacion*=i;
        }
        return multiplicacion;
    }
}
