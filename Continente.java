public class Continente {

    private String nombre;
    private String oceano_asociado;
    private int numero_paises;

    public Continente(String nombre, String oceano_asociado, int numero_paises){
        this.nombre = nombre;
        this.oceano_asociado=oceano_asociado;
        this.numero_paises=numero_paises;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getOceanoAsociado(){
        return oceano_asociado;
    }

    public void setOceanoAsociado(String oceano_asociado){
        this.oceano_asociado=oceano_asociado;
    }

    public int getNumeroPaises(){
        return numero_paises;
    }

    public void setNumeroPaises(int numero_paises){
        this.numero_paises=numero_paises;
    }
}
