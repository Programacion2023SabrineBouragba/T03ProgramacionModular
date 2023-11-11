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
        int numero;
        int ultimo;

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
                    ultimo= volteaNumero(numero);
                    System.out.println(numero + " volteado: " + ultimo);

                    break;
                case 4:
                    System.out.println("¿Es capicúa?: ");
                    System.out.println();
                    numero=dameNumero();
                    volteaNumero(numero);
                    boolean esCapicua= esCapicua(numero);
                    if (esCapicua){
                        System.out.println("El numero introducido es capicúa.");
                    }else{
                        System.out.println("El numero introducido no es capicúa.");
                    }

                    break;
                case 5:
                    System.out.println("Mostrar capicúas: ");
                    System.out.println();
                    numero=dameNumero();
                    muestraNCapicuas(numero);

                    break;
                case 6:
                    System.out.println("Quitar dígitos por atrás: ");
                    System.out.println();

                    break;
                case 7:
                    System.out.println("Pasar de binario a decimal: ");
                    int binario=dameNumero();

                    /*si el numero introducido al completar el metodo es falso,
                     que me devuelva el siguiente mensaje*/
                    if (validarBinarios(binario)){
                        System.out.println("Numero introducido no válido.");
                        return;
                    }

                    int decimal=binarioToDecimal(binario);
                    System.out.println("El decimal es: " + decimal);

                    break;
                case 8:
                    System.out.println("De binario a octal: ");
                    System.out.println();

                    int binario1=dameNumero();
                    int decimal1=binarioToDecimal(binario1);
                    int octal=binarioToOctal(decimal1);
                    System.out.println("El numero equivalente en octal: " + octal);

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
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }

    /**
     * metodo para obtener el ultimo digito del numero introducido
     * obtencion del numero con formula
     */
    static int dameUltimo(int numero){
        return numero%10;
    }

    /**
     * metodo para quitar el ultimo digito del numero introducido mediante una formula
     */
    static int quitaUltimo(int numero){
        int quitUlt;
        if(numero<10){
            quitUlt=-1;
        }else{
            quitUlt= numero/10;
        }


        return quitUlt;
    }

    /**
     * metodo para voltear el numero introducido y mostratelo
     */
    static int volteaNumero(int numero){
        //declaracion variables
        int numVolteado=0;
        /*
        mientras el numero introducido sea diferente de 0, entrar en el bucle,
        variable iniciada igualada a ella misma por 10, sumandole el ultimo numero del numero introducido,
        depues a el numero inicial se le quita el ultimo digito y se vuelve a iniciar el bucle
         */
        while(numero!=-1){
            int ultimo=dameUltimo(numero);
            numVolteado=(numVolteado*10)+ultimo;
            numero=quitaUltimo(numero);
        }
        return numVolteado;
    }

    /**
     * metodo utiliza el metodo de voltear el numero para ver si este y esCapicua son iguales,
     * si lo son que me devuleva true, sino que me devuleva false.
     */
    static boolean esCapicua(int numero){

        int volteado=volteaNumero(numero);

        if (numero !=volteado){
            return false;
        }

        return true;
    }

    /**
     * metodo para mostrar los numeros capicuas, dependiendo del numero que introduzca el susuario
     * si introduce 2, le mostraran los dos primeros capicuas a partir del numero 10.
     */
    static void muestraNCapicuas(int numero){
        int cont=0;

        /*empezando en 10, mientras contador sea menor que el numero
          la i va aumentando*/
        for(int i=10; cont<numero; i++){
            //si la i al utilizar el metodo esCapicua, da verdadero, mostrarlo y aumentar el contador, así sucesivamente
            if (esCapicua(i)) {
            System.out.println(i);
            cont++;
            }
        }
    }

    /**
     *metodo para validar el numero introducido, verificar si es binario
     */
    static boolean validarBinarios(int binario){
        //convertimos el binario en cadena
        String binarioCadena= String.valueOf(binario);
        //bucle para la cadena
        /*
        iniciamos en 0, vamos aumentando hasta llegar al largo de la cadena.
         */
        for(int i=0; i<binarioCadena.length(); i++){
            //dividir la cadena por caracteres, empieza por el primero
            char caracter= binarioCadena.charAt(i);
            /*si el primer caracter es diferente de 0 y de 1, devolver valor falso
            * sino ir comprobando el resto de caracteres, y si todos son o cros o unos, que me devuleva true
            *  y empiece a calcularlo a decimal*/

            /* agregado una condición extra para el primer carácter (cuando i == 0) que permite que sea '0'
             a partir del segundo carácter (i > 0), la validación normal de '0' y '1' se aplica
             esto permite números binarios que comienzan con ceros */
            if (i == 0 && caracter != '0' && caracter != '1') {
                return true;
            } else if (i > 0 && (caracter != '0' && caracter != '1')) {
                return true;
            }
        }
        return false;
    }

    /**
     *metodo para poder coalcular un numero proporcionado en binario
     * pasarlo a decimal y que me lo muestre
     */
    static int binarioToDecimal(int binario){
        int decimal=0;
        int exponente=0;

        //mientras validar binario sea true, empezar bucle.
        while(true){
            //si el binario es igual a 0, acabar bucle
            if(binario==0){
                break;
            }else{
                /* almacenar en ult el ultimo numero del binario introducido
                 en variable decimal se almacenara el calculo de:
                el ultimo caracter del numero introducido, por base 2 exponente inicial 0(utilizando la formula math pow), el exponente irá umentando
                despues al numero introducido se le quitará el ultimo caracter, y el exponente se aumentara en uno */
                int ult= binario%10;
                decimal+= (int) (ult*Math.pow(2, exponente));
                binario= binario/10;
                exponente++;
            }
        }
        return decimal;
    }

    /**
     *metodo para pasar de decimal a octal, utilizando el metodo anterior
     * se introducira el numero binario, se hara la conversion en el metodo binarioToDecimal
     * una vez hecho, se pasa de decimal a octal
     * inicio variables e al comprobar que el decimal es distinto de 0, comienzo el bucle
     * en la variable ultimo, mediante esa formulo, consigo el ultimo digito del numero
     * en la variable octal almaceno y calculo el ultimo digito por 8 elevado inicialmente a 0, depues irá incrementando
     * en la variable decimal se quita el ultimo digito, y vuelve a iniciar el bucle, hasta que no queden digitos en el numero.
     */
    static int binarioToOctal(int decimal){
        int octal=0;
        int expo=0;

        while(decimal!=0){
            int ultimo=decimal%8;
            octal+= (int) (ultimo*Math.pow(10, expo));
            decimal/=8;
            expo++;
        }
        return octal;
    }
}


