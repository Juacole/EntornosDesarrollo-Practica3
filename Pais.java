public class Pais {
    private String nombre;
    private int num_habitantes;
    private String idioma_oficial;
    private double extension_geografica;
    private String continente;
    private boolean democracia;
    private static int numPaises=0;

    public Pais(){
        nombre="";
        num_habitantes = -1;
        idioma_oficial = "";
        extension_geografica=-1;
        continente="";
        democracia=false;
        numPaises++;
    }

    public Pais(String a){
        nombre=a;
        numPaises++;
    }

    public Pais(String a, String b, String c){
        nombre=a;
        idioma_oficial=b;
        continente=c;
        numPaises++;
    }

    public Pais(String a, int b, String c, double d, String e, boolean f){
        nombre=a;
        num_habitantes=b;
        idioma_oficial=c;
        extension_geografica=d;
        continente=e;
        democracia=f;
        numPaises++;
    }

    public void setNumHabitantes(int a){
        num_habitantes=a;
        if(num_habitantes>100000){
            System.out.println("El numero de habitantes es mayor a 100000.");
        } else {
            System.out.println("El numero de habitantes no es mayor a 100000.");
        }
    }

    public void setContinente(String a, double b){
        continente=a;
        extension_geografica=b;
        System.out.println("El continente es " + continente + " y su extension geografica es " + extension_geografica + " km².");
    }

    public boolean continenteEnPais(){
        boolean contiene = nombre.contains(continente);
        return contiene;
    }

    public void setNombre(String q){
        nombre=q;
    }

    public void setNum_habitantes(int w){
        num_habitantes=w;
    }

    public void setIdioma_oficial(String e){
        idioma_oficial=e;
    }

    public void setExtension_geografica(double r){
        extension_geografica=r;
    }

    public void setContinente(String t){
        continente=t;
    }

    public void setDemocracia(boolean y){
        democracia=y;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNum_habitantes(){
        return num_habitantes;
    }

    public String getIdioma_oficial(){
        return idioma_oficial;
    }

    public double getExtension_geografica(){
        return extension_geografica;
    }

    public String getContinente(){
        return continente;
    }

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