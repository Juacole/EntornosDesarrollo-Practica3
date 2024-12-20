import java.util.Scanner;
import java.util.ArrayList;

public class MiVector {

    private int[] v;
    private int tam;

    public MiVector(){
        tam=0;
        v = new int[tam];
    }

    public MiVector(int tam){
        if(tam<0){
            System.err.println("Valor invalido, un array no puede tener de tamaño un valor negativo.");
            this.tam=0;
        }else{
            this.tam=tam;
        }
        v = new int [tam];
    }

    public MiVector(int[] array){
        this.tam=array.length;
        this.v = new int[array.length];
        for(int i=0; i<array.length; i++){
            this.v[i]=array[i];
        }
    }

    public MiVector(MiVector copia){
        this.tam=copia.tam;
        this.v = new int[copia.tam];
        for(int i=0; i<copia.tam; i++){
            this.v[i]=copia.v[i];
        }
    }

    public int getTam() {
        return tam;
    }

    public int[] getArray(){
        return v;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setArray(int[] v){
        this.v=v;
    }

    public void printTamanio(){
        System.out.println("\nEl tamaño de nuestro array es de: " + tam);
    }

    public void tamanioArray(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<this.tam; i++){
            System.out.print("Ingresa un numero para la posicion " + i + " del array: ");
            v[i]=scan.nextInt();
        }
    }

    public void printArray(){
        System.out.println("\nEl array resultante es: ");
        for(int i=0; i<this.tam; i++){
            System.out.print(v[i] + "  ");
        }
        System.out.println();
    }

    public void aniadir(int valor){
       int[] aux = new int[this.tam+1];
       for(int i=0; i<this.tam; i++){
           aux[i]=this.v[i];
       }
       aux[this.tam]=valor;
       for(int i=0; i<this.tam; i++){
           this.v=aux;
       }
       this.tam++;
       printArray();
    }

    public void aniadirx2(int valor, int indice){
        int[] aux = new int[this.tam+1];
        for(int i=0; i<indice; i++){
            aux[i]=this.v[i];
        }
        aux[indice]=valor;

        for(int i=indice; i<this.tam; i++){
            aux[i+1]=v[i];
        }
        for(int i=0; i<this.tam; i++){
            this.v=aux;
        }
        this.tam++;
        printArray();
    }

    public boolean esVacio(){
        return tam==0;
    }

    public void vaciar(){
        for(int i=0; i<this.tam; i++){
            if(v[i] != 0){
                v[i]=0;
            }
        }
        printArray();
    }

    public void reiniciar(){
        for(int i=0; i<this.tam; i++){
            if(v[i] != 0){
                v[i]=0;
            }
        }
        this.tam=0;
        printArray();
    }

    public int recuperarElemento(int posicion){
        if(posicion >= this.v.length){
            return -1;
        }
        return this.v[posicion];
    }

    public boolean buscarElemento(int busqueda){
        for(int i=0; i<this.v.length; i++){
            if(v[i] == busqueda){
                return true;
            }
        }
        return false;
    }

    public void eliminarElemento(int ocurrencia) {
        for (int i=0; i<this.tam -1; i++) {
            if (v[i] == ocurrencia) {
                for (int j=i; j<this.tam -1; j++) {
                    v[j]=v[j+1];
                }
                this.tam--;
            }
        }
    }

    public void eliminarPosicion(int posicion){
        for(int i=posicion; i<this.tam -1; i++){
            v[i]=v[i+1];
        }
        this.tam--;
        printArray();
    }

    public void eliminarElementoTotal(int total){
        int aux = 0;
        for(int i=0; i<this.v.length; i++){
            if(v[i] != total){
                v[aux]=v[i];
                aux++;
            }
        }
        this.tam=aux;
        printArray();
    }

    public String toString(){
        String array = "";
        for(int i=0; i<this.v.length; i++){
            array += v[i];
            if(i < v.length -1){
                array +=", ";
            }
        }
        return array;
    }

    public MiVector clone(){
        MiVector copia = new MiVector(this.tam);
        for(int i=0; i<this.v.length; i++){
            copia.v[i]=this.v[i];
        }
        return copia;
    }

    public boolean equals(MiVector comparacion){
        if(this.tam != comparacion.tam){
            return false;
        }
        for(int i=0; i<this.tam; i++){
            if(this.v[i] != comparacion.v[i]){
                return false;
            }
        }
        return true;
    }

    public void arrayOrdenadoBurbuja(){
        int aux;
        for(int i=0; i<this.v.length; i++){
            for(int j=0; j<this.v.length -i -1; j++){
                if(v[j]>v[j+1]){
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
        printArray();
    }


    public void quicksort() {
        quicksortAyudante(0, tam - 1);
        printArray();
    }

    private void quicksortAyudante(int primero, int ultimo) {
        if (primero < ultimo) {
            int pivote=v[ultimo];
            int i= primero-1;

            for (int j=primero; j<ultimo; j++) {
                if (v[j] <= pivote) {
                    i++;
                    int aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }

            int aux =v[i+1];
            v[i+1]=v[ultimo];
            v[ultimo]=aux;

            int indice = i+1;

            quicksortAyudante(primero, indice - 1);
            quicksortAyudante(indice + 1, ultimo);
        }
    }

    public static void main(String[] args) {
        MiVector h1 = new MiVector(7);
        h1.tamanioArray();
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