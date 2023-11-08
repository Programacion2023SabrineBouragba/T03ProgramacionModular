import java.util.Scanner;

public class Actividad2 {
    /**
     * metodo para que me muestre el menú y sus funciones
     * dependiendo del numero que introduzca
     * mientras no sea 10, porque sale del programa
     */
    public static void main(String[] args){
        //variable opcion donde me leera la opcion introducida del menu
        int opcion;
        int numero=0;

        /*mientras la opcion introducida sea diferente a 10,
        ir mostrarndo las funciones/acciones dependiendo de la opcion introducida
         */
        do{
            //llamar al metodo para iniciar la funcion correspondiente
            opcion= mostrarMenu();

            switch(opcion){

                case 1:
                    System.out.println("Mostrar el último dígito: ");
                    System.out.println();
                    numero=dameNumero();
                    int ultNum= dameUltimo(numero);
                    System.out.println("El último digito del número introduce es: " + ultNum);

                    break;
                case 2:
                    System.out.println("Quitar el último dígito: ");
                    System.out.println();
                    opcion=dameNumero();
                    int quitUlt= quitaUltimo(opcion);
                    System.out.println("El número final sería: " + quitUlt);

                    break;
                case 3:
                    System.out.println("Voltear el número: ");
                    System.out.println();
                    numero=dameNumero();
                    int ultimo= volteaNumero(numero);
                    System.out.println(numero + " volteado: " + ultimo);

                    break;
                case 4:
                    System.out.println("¿Es capicúa?: ");
                    System.out.println();

                    break;
                case 5:
                    System.out.println("Mostrar capicúas: ");
                    System.out.println();

                    break;
                case 6:
                    System.out.println("Quitar dígitos por atrás: ");
                    System.out.println();

                    break;
                case 7:
                    System.out.println("Pasar de binario a decimal: ");
                    System.out.println();

                    break;
                case 8:
                    System.out.println("De binario a octal: ");
                    System.out.println();

                    break;
                case 9:
                    System.out.println("De binario a hexadecimal: ");
                    System.out.println();

                    break;
                case 10:
                    System.out.println("Saliendo....");
                    System.out.println();

                    break;
            }
        }while(opcion!=10);


    }

    /**
     * metodo para que me vaya mostrando menú
     * si no se introduce un numero de dentro del menu
     */
    static int mostrarMenu(){
        Scanner sc= new Scanner(System.in);
        int opcion;

        //ir mostrando menu si se introduce un numero menor que 1 o mayor que 10
        do{
            System.out.println("Menú: ");
            System.out.println("1. Dame último");
            System.out.println("2. Quita último");
            System.out.println("3. Voltea número");
            System.out.println("4. Es capicúa");
            System.out.println("5. Muestra los capícuas");
            System.out.println("6. Quita por detrás");
            System.out.println("7. De binario a decimal");
            System.out.println("8. De binario a octal");
            System.out.println("9. De binario a hexadecimal");
            System.out.println("10. Salir");

            System.out.print("Introduce una opción del menú: ");
            opcion=sc.nextInt();

        }while (opcion<1 || opcion>10);

        return opcion;
    }

    /**
     * metodo para que el usuario introduzca un numero
     */
    static int dameNumero(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return sc.nextInt();
    }

    /**
     * metodo para obtener el ultimo digito del numero introducido
     * obtencion del numero con formula
     */
    static int dameUltimo(int numero){
        int ultNum= numero%10;
        return ultNum;
    }

    /**
     * metodo para quitar el ultimo digito del numero introducido mediante una formula
     */
    static int quitaUltimo(int numero){
        int quitUlt= numero/10;
        return quitUlt;
    }

    /**
     *metodo para voltear el numero introducido y mostratelo
     */
    static int volteaNumero(int numero){
        //declaracion variables
        int numVolteado=0;
        /*
        mientras el numero introducido sea diferente de 0, entrar en el bucle,
        variable iniciada igualada a ella misma por 10, sumandole el ultimo numero del numero introducido,
        depues a el numero inicial se le quita el ultimo digito y se vuelve a iniciar el bucle
         */
        while(numero!=0){
            int ultimo=dameUltimo(numero);
            numVolteado=(numVolteado*10)+ultimo;
            numero=quitaUltimo(numero);
        }
        return numVolteado;
    }

}
