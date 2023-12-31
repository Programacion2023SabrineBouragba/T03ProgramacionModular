//Autor: Sabrina Bouragba Anhari

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args){
        int opcion;
        int numero;

        do{
            /*llamo a la función menu me muestra el menu
              y con el switch me muestra cada opcion con su funcion*/
            opcion= mostrarMenu();
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
                    mostrarSaludo(nombre, numero);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Números primos");
                    int num=dameNumero();
                    boolean esPrimo= esPrimo(num);
                    if (esPrimo){
                        System.out.println("El numero introducido es primo.");
                    }else{
                        System.out.println("El numero introducido no es primo.");
                    }
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
                    int base= dameNumero();
                    int expo= dameNumero2();
                    int total= potencia(base, expo);
                    System.out.println("La potencia es de: " + total);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Pirámide");
                    String caracter= obtenerCaracter();
                    numero=dameNumero();
                    mostrarPiramide(caracter, numero);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Fibonacci");
                    numero=dameNumero();
                    mostrarFibonnacci(numero);
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
    static int mostrarMenu(){

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

    static void mostrarSaludo(String nombre, int numero){
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
        int modulo;
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
        /*empezando por 1, maximo el numero introducido
        ir sumando sucesivamente hasta llegar al maximo*/
        for(int i=1; i<=numero; i++){
            suma+=i;
        }
       return suma;
    }

    static int multiNEnteros(int numero){
        int multiplicacion=1;
        /*empezando en 1, ir multiplicando en orden numerico
        hasta llegar al maximo*/
        for(int i=1; i<=numero; i++){
            multiplicacion*=i;
        }
        return multiplicacion;
    }

    static int dameNumero2() {

        /*Declaro el scanner para que cuando se llame a este metodo
         se vuelva a introducir un numero*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce otro numero entero: ");
        return sc.nextInt();
    }

    static int potencia(int numero, int numero2){
        int total=1;

        /*empezando en 0, ir aumentando hasta llegar al numero introducido de veces
        multiplicar el numero inicial(base/numero)
        las veces que se ha introducido(exponente/numero2)*/
        for(int i=0; i<numero2; i++){
            total*=numero;
        }
        return total;
    }

    /**
     * metodo para que el usuario introduzca un carácter para ser utilizado en mostrarpiramide
     */
    static String obtenerCaracter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        return sc.next();

    }

    static void mostrarPiramide(String caracter, int numero){

        /*
        i= empezando en 1, ir aumentando la fila hasta llegar al maximo
        j= emepzando en 0, maximo valor i, ir aumentando la columna
        imprimiedo en caracter introducido
         */
        for(int i=1; i<=numero; i++){
            for(int j=0; j<i; j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    static void mostrarFibonnacci(int numero){
        int a= 0;
        int b= 1;
        int c;

        //empezamos en 0, va sumando e imprimiendo
        //hasta llegar al maximo introducido(numero)
        for(int i= 0; i<numero; i++){
            //imprimir primero el valor 0
            System.out.print(a + " ");
            //darle valor a la variable c
            c= a+b;
            //el valor a será igual al valor de b
            a=b;
            //b será el valor de c
            b= c;

            /*
            se imprimira el valor a=0, despues hará la suma de a+b,
            inicialmente será 1, damos valor a a=b, y b=c,
            volvera a imprimir a, pero esta vez vale=1,
            despues tendremos que c=a(1) + b(1), intercambiamos valores
            e imprimira el valor a que es 2,
            despues c= 1+2,
            c=2+3
            c=3+5
            el resultado de cada suma se almacena en c, y lo intercambiamos con el valor b
            asi sucesivamente hasta que acabe el bucle
             */
        }
    }
}
