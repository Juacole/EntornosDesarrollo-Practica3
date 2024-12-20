import java.util.Scanner;
import java.util.ArrayList;

public class MiVector {
    private int[] v;
    private int tam;
    public MiVector(int a){
        tam=a;
        v = new int [tam];
    }

    public boolean arrayInicio(){
        return tam==0;
    }

    public void tamanioArray(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<tam; i++){
            System.out.print("Ingresa un numero para la posicion " + i + " del array: ");
            v[i]=scan.nextInt();
        }
    }

    public void printArray(){
        System.out.println("\nEl array resultante es: ");
        for(int i=0; i<tam; i++){
            System.out.print(v[i] + "  ");
        }
        System.out.println();
    }

    public void printTamanio(){
        System.out.println("\nEl tamaño de nuestro array es de: " + tam);
    }

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
