/**
 * Clase enfocada a la manipulacion de arrays.
 *
 * @author Joaquin Puchuri Tunjar
 * @version 1.0
 */

import java.util.Scanner;
import java.util.ArrayList;

public class MiVector {

    private int[] v;
    private int tam;

    /**
     * Constructor que inicializa el objeto a traves de un parametro.
     * @param a que inicializa el tamaño del array.
     */
    public MiVector(int a){
        tam=a;
        v = new int [tam];
    }

    /**
     * Metodo que verifica si el array tiene un tamaño.
     * @return tam devuelve true o false en funcion a si tam tiene un valor.
     */
    public boolean arrayInicio(){
        return tam==0;
    }

    /**
     * Metodo que le pide al usuario que ingrese los elementos del array en funcion al tamaño del array.
     */
    public void tamanioArray(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<tam; i++){
            System.out.print("Ingresa un numero para la posicion " + i + " del array: ");
            v[i]=scan.nextInt();
        }
    }

    /**Metodo que imprime por pantalla los elementos del array.
     */
    public void printArray(){
        System.out.println("\nEl array resultante es: ");
        for(int i=0; i<tam; i++){
            System.out.print(v[i] + "  ");
        }
        System.out.println();
    }

    /**Metodo que imprime por pantalla el tamaño actual del array.
     */
    public void printTamanio(){
        System.out.println("\nEl tamaño de nuestro array es de: " + tam);
    }

    /**Metodo que reinicia el array de forma que se eliminen todos sus elementos y se elimine el tamaño del mismo.
     */
    public void destructor(){
        tam=0;
        System.out.println("\nNuestro array ha sido destruido, contiene una cantidad de " + tam + " valores.");
    }

    public static void main(String[] args){
        MiVector h = new MiVector(7);
        System.out.println("El array esta vacio: " + h.arrayInicio());
        h.tamanioArray();
        h.printArray();
        h.printTamanio();
        h.destructor();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(5);
        numbers.add(18);
        numbers.add(9);
        numbers.add(1);


        System.out.println("\nImprimiendo directamente el array: " + numbers + " ");

        int[] comprobacion = {12, 13, 14};

        System.out.println("\nCompprobamos si 12, 13 y 14 estan contenidos en nuestro array: ");
        for(Integer num : comprobacion){
            if(numbers.contains(num)){
                System.out.println("El numero " + num + " esta contenido en el array.");
            }else{
                System.out.println("El numero " + num + " no esta contenido en el array.");
            }
        }

        System.out.println("\nNuestro array esta vacio: " + numbers.isEmpty());

        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) == 9){
                numbers.remove(i);
            }
        }
        System.out.println("\nNuestro array resultando luego de haber eliminado el 9: " + numbers);

        System.out.println("\nEl tamaño de nuestro array es: " + numbers.size());

        numbers.clear();
        System.out.println("\nNuestro array esta vacio: " + numbers.isEmpty());
    }
}
