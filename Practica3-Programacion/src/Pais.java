/**
 * Clase que representa un país con sus atributos principales.
 * Contiene información sobre habitantes, idioma oficial, extensión geografica, y más.
 *
 * @author Joaquin Puchuri Tunjar
 * @version 1.0
 */

public class Pais {

    private String nombre;
    private int num_habitantes;
    private String idioma_oficial;
    private double extension_geografica;
    private String continente;
    private boolean democracia;
    private static int numPaises=0;


    /**
     * Constructor por defecto de la clase Pais,
     * inicializa los atributos con valores predeterminados.
     */
    public Pais(){
        nombre="";
        num_habitantes = -1;
        idioma_oficial = "";
        extension_geografica=-1;
        continente="";
        democracia=false;
        numPaises++;
    }

    /**
     * Constructor que inicializa solo el nombre del país.
     *
     * @param a asigna el nombre del país.
     */
    public Pais(String a){
        nombre=a;
        numPaises++;
    }

    /**
     * Constructor que inicializa solo el nombre del país, el idioma oficial y el continente.
     *
     * @param a asigna el nombre del país.
     * @param b asigna el idioma oficial.
     * @param c asigna el nombre del continente.
     */
    public Pais(String a, String b, String c){
        nombre=a;
        idioma_oficial=b;
        continente=c;
        numPaises++;
    }

    /**
     * Constructor que inicializa solo el nombre del país, el idioma ofici, el continente y más.
     *
     * @param a asigna el nombre del país.
     * @param b asigna el idioma oficial.
     * @param c asigna el nombre del continente.
     * @param d asigna el valor de la extension geografica.
     * @param e asigna el nombre del continente.
     * @param f recibe true o false si el pais vive en una democracia.
     */
    public Pais(String a, int b, String c, double d, String e, boolean f){
        nombre=a;
        num_habitantes=b;
        idioma_oficial=c;
        extension_geografica=d;
        continente=e;
        democracia=f;
        numPaises++;
    }

    /**
     * Metodo que recibe por parametro el numero de habitantes,
     * calculando el numero en un rango de 0 a 100000
     * @param a recibe el numero de habitantes en un pais.
     */
    public void setNumHabitantes(int a){
        num_habitantes=a;
        if(num_habitantes>100000){
            System.out.println("El numero de habitantes es mayor a 100000.");
        } else {
            System.out.println("El numero de habitantes no es mayor a 100000.");
        }
    }

    /**
     * Metodo que recibe por parametro el nombre de un continente y
     * el número correspondiente a la extension geografica.
     * @param a recibe el nombre de un continente.
     * @param b recibe la extension geografica.
     */
    public void setContinente(String a, double b){
        continente=a;
        extension_geografica=b;
        System.out.println("El continente es " + continente + " y su extension geografica es " + extension_geografica + " km².");
    }

    /**
     * Metodo que devuelve un booleano dependiendo si el nombre
     * esta contenido dentro del continente.
     * @return contiene de tipo boolean.
     */
    public boolean continenteEnPais(){
        boolean contiene = nombre.contains(continente);
        return contiene;
    }

    /**
     * Setter que recibe por parametro el nombre de un pais.
     * @param q recibe el nombre de un pais.
     */
    public void setNombre(String q){
        nombre=q;
    }

    /**
     * Setter que recibe por parametro el numero de habitantes de un pais.
     * @param w recibe el numero de habitantes de un pais de un pais.
     */
    public void setNum_habitantes(int w){
        num_habitantes=w;
    }

    /**
     * Setter que recibe por parametro el nombre de un pais.
     * @param e recibe el idioma oficial de un pais.
     */
    public void setIdioma_oficial(String e){
        idioma_oficial=e;
    }

    /**
     * Setter que recibe por parametro la extension geografica de un pais.
     * @param r recibe la extension geografica de un pais.
     */
    public void setExtension_geografica(double r){
        extension_geografica=r;
    }

    /**
     * Setter que recibe por parametro el nombre de un continente.
     * @param t recibe el nombre de un continente.
     */
    public void setContinente(String t){
        continente=t;
    }


    /**
     * Setter que recibe por parametro si el pais es democratico o no.
     * @param y recibe un boolean dependiendo si el pais es democratico o no.
     */
    public void setDemocracia(boolean y){
        democracia=y;
    }


    /**
     * Getter que devuelve el valor del atributo nombre.
     * @return nombre de tipo String.
     */
    public String getNombre(){
        return nombre;
    }



    /**
     * Getter que devuelve el valor del atributo num_habitantes.
     * @return num_habitantes de tipo int.
     */
    public int getNum_habitantes(){
        return num_habitantes;
    }


    /**
     * Getter que devuelve el valor del atributo nombre.
     * @return nombre de tipo String.
     */
    public String getIdioma_oficial(){
        return idioma_oficial;
    }


    /**
     * Getter que devuelve el valor del atributo extension_geografica.
     * @return extension_geografica de tipo double.
     */
    public double getExtension_geografica(){
        return extension_geografica;
    }

    /**
     * Getter que devuelve el valor del atributo contiene.
     * @return contienen de tipo String.
     */
    public String getContinente(){
        return continente;
    }

    /**
     * Getter que devuelve el valor del atributo democracia.
     * @return democracia de tipo boolean-
     */
    private boolean getDemocracia(){
        return democracia;
    }

    public static void main(String[] args){

        Pais h = new Pais();
        h.setNumHabitantes(1421);
        h.setContinente("Asia", 8.25626179);
        System.out.println("En el nombre del continente aparece el nombre del pais: " + h.continenteEnPais());

        Pais h1 = new Pais();
        Pais h2 = new Pais();
        Pais h3 = new Pais();

        h1.setNombre("Europa");
        System.out.println("\nEl nombre del continente es: " + h1.getNombre());

        h2.setIdioma_oficial("Español");
        System.out.println("\nEl idioma oficial es: " + h2.getIdioma_oficial());

        h3.setNum_habitantes(14534);
        System.out.println("\nEl numero de habitantes es: " + h3.getNum_habitantes());

        Pais h4 = new Pais("Peru");
        System.out.println("\nPrueba del constructor 1: " + h4.nombre);


        Pais h5 = new Pais("Alemania", "Aleman", "Europa");
        System.out.println("\nPrueba del constructor 2: " + h5.nombre + " " + h5.idioma_oficial + " " + h5.continente);


        Pais h6 = new Pais("España", 48000000, "Castellano", 506030, "Europa", true);
        System.out.println("\nPrueba del constructor 3: " + h6.nombre + " " + h6.num_habitantes + " " + h6.idioma_oficial + " " + h6.extension_geografica + " km^2  " + h6.continente + " " + h6.democracia);

        System.out.println("\nEl numero de objetos de tipo Pais declarados son: " + Pais.numPaises);
    }
}
