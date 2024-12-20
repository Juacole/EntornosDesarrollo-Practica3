/**
 * Clase que representa un continente con sus atributos principales.
 * Contiene información sobre el nombre, océano asociado y número de países.
 *
 * @author Joaquin Puchuri Tunjar
 * @version 1.0
 */

public class Continente {

    private String nombre;
    private String oceano_asociado;
    private int numero_paises;


    /**
     * Constructor de la clase Continente.
     *
     * @param nombre          tipo String asigna el nombre del continente.
     * @param oceano_asociado tipo String asigna el nombre del océano asociado al continente.
     * @param numero_paises   tipo entero que asigna el numero de países en el continente.
     */
    public Continente(String nombre, String oceano_asociado, int numero_paises) {
        this.nombre = nombre;
        this.oceano_asociado = oceano_asociado;
        this.numero_paises = numero_paises;
    }


    /**
     * Devuelve el nombre del continente.
     * @return nombre de tipo String.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene el nombre del continente a traves de un parametro.
     * @param nombre que asgina un nombre al Continente.
     * */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * Devuelve el oceano asociado del continente.
     * @return oceano_asociado de tipo String.
     */
    public String getOceanoAsociado(){
        return oceano_asociado;
    }

    /**
     * Obtiene el oceano asociado del continente a traves de un parametro.
     * @param oceano_asociado que asgina un nombre al Continente.
     * */
    public void setOceanoAsociado(String oceano_asociado){
        this.oceano_asociado=oceano_asociado;
    }

    /**
     * Devuelve el numero de paises del continente.
     * @return numero_paises de tipo int.
     */
    public int getNumeroPaises(){
        return numero_paises;
    }

    /**
     * Obtiene el numero de paises del continente a traves de un parametro.
     * @param numero_paises que asgina un nombre al Continente.
     * */
    public void setNumeroPaises(int numero_paises){
        this.numero_paises=numero_paises;
    }
}
