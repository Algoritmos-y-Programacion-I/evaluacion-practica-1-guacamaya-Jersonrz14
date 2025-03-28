package ui;

import java.util.Scanner;

public class Guacamaya {

    // Scanner global para todo el programa
    public static Scanner reader;
    // Arreglos de precios y unidades para todo el programa
    public static double[] precios;
    public static int[] unidades;
    int referencia;
    int cantidadvendida;


    




    
    
    

    public static void main(String[] args) {

        inicializarGlobales();
        menu();
    }

    /**
     * Descripcion: Este metodo se encarga de iniciar las variables globales
     * pre: El Scanner reader debe estar declarado
     * pos: l Scanner reader queda inicializado
    */
    public static void inicializarGlobales() {

        reader = new Scanner(System.in);

    }

    /**
     * Descripcion: Este metodo se encarga de desplegar el menu al usuario y mostrar los mensajes de resultado para cada funcionalidad
     * pre: El Scanner reader debe estar inicializado
     * pre: El arreglo precios debe estar inicializado
    */
    public static void menu() {

        System.out.println("Bienvenido a Guacamaya!");

        establecerCantidadVendida();

        boolean salir = false;

        do {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Solicitar precios ($) y cantidades de cada referencia de producto vendida en el dia");
            System.out.println("2. Calcular la cantidad total de unidades vendidas en el dia");
            System.out.println("3. Calcular el precio promedio de las referencias de producto vendidas en el dia");
            System.out.println("4. Calcular las ventas totales (dinero recaudado) durante el dia");
            System.out.println("5. Consultar el numero de referencias de productos que en el dia han superado un limite minimo de ventas");
            System.out.println("6. Salir");
            System.out.println("\nDigite la opcion a ejecutar");
            int opcion = reader.nextInt();

            switch (opcion) {
                case 1:
                    solicitarDatos();
                    break;
                case 2:
                    System.out.println("\nLa cantidad total de unidades vendidas en el dia fue de: "+calcularTotalUnidadesVendidas());
                    break;
                case 3:
                    System.out.println("\nEl precio promedio de las referencias de producto vendidas en el dia fue de: "+calcularPrecioPromedio());
                    break;
                case 4:
                    System.out.println("\nLas ventas totales (dinero recaudado) durante el dia fueron: "+calcularVentasTotales());
                    break;
                case 5:
                    System.out.println("\nDigite el limite minimo de ventas a analizar");
                    double limite = reader.nextDouble();
                    System.out.println("\nDe las "+precios.length+" referencias vendidas en el dia, "+consultarReferenciasSobreLimite(limite)+" superaron el limite minimo de ventas de "+limite);
                    break;
                case 6:
                    System.out.println("\nGracias por usar nuestros servicios!");
                    salir = true;
                    reader.close();
                    break;

                default:
                    System.out.println("\nOpcion invalida, intenta nuevamente.");
                    break;
            }

        } while (!salir);

    }

    /**
     * Descripcion: Este metodo se encarga de preguntar al usuario el numero de referencias de producto diferentes 
     * vendidas en el dia e inicializa con ese valor los arreglos encargados de almacenar precios y cantidades
     * pre: El Scanner reader debe estar inicializado
     * pre: Los arreglos precios y unidades deben estar declarados
     * pos: Los arreglos precios y unidades quedan inicializados
     */
    public static void establecerCantidadVendida() {

        System.out.println("\nDigite el numero de referencias de producto diferentes vendidas en el dia ");
        int referencias = reader.nextInt();

        precios = new double[referencias];
        unidades = new int[referencias];

        int [][] reader = new int [referencia];
        for (int i = 0; i < referencias, i++ ){
        }
        return inicializarGlobales;

    }

       /**
     * Descripcion: Este metodo se encarga de preguntar al usuario la cantidad de unidades y el precio de estas 
     * pre: El Scanner reader debe estar inicializado
     * pre: Los arreglos precios y unidades deben estar declarados
     * pos: Los arreglos precios y unidades quedan inicializados
     */  

    public static void solicitarDatos(){ 

        inicializarGlobales();
        

        double[][] reader = new double [precios];
        int [][] reader = new int [unidades];
        for (double m = 0; m < precios; m++){
            System.out.println("\n ingrese el precio del producto" + (m + 1));
            reader[m] = reader.nextInt();
                for (int j = 0; i < unidades; j++){
                    reader[j] = reader.nextInt();
                }

        }

        return inicializarGlobales;
     
    }


   /**
     * Descripcion: Este metodo se encarga de señalar al usuario la cantidad total de unidades vendidas 
     * pre: Los arreglos precios y unidades deben estar declarados
     * pos: Los arreglos precios y unidades quedan inicializados
     */  


    public static int calcularTotalUnidadesVendidas(int [] numeros){

        int cantidadvendida = total.length;
        double precios = total[0].length;
        


    }

    public static double calcularPrecioPromedio(){

        return 0;


    }

    public static double calcularVentasTotales(){

        return 0;


    }

    public static int consultarReferenciasSobreLimite(double limite){

        return 0;

    }

}
