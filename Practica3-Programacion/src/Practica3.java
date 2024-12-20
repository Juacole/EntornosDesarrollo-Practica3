
/*¿Es necesario añadirle un destructor también?
 * No, no es necesario agregarlo un destructor, ya que java tiene integrado
 * un recolector de basura que se encarga de automatizar esta tarea*/

class Practica3{

    //ATRIBUTOS
    private boolean actividades_entregadas;
    private double nota_practica;
    private double nota_examen;

    //CONSTRUCTOR
    public Practica3(){
        actividades_entregadas = true;
        nota_practica = 7.5;
        nota_examen = 5.5;
    }
    //METODOS

    /*El metodo imprimirNotas da por pantalla las notas de los distintos alumnos, primero te confirma si
     * las notas has entregado todas las actividades y segundo que te imprime tanto las notas de la practica
     * como la del examen.*/
    public void imprimirNotas(){
        System.out.println("La nota de clase es la siguiente: ");
        if(actividades_entregadas){
            System.out.println("\nSe han entregado las actividades del tema.");
        }
        System.out.println("Nota de prácticas: " + nota_practica);
        System.out.println("Nota de examen: " + nota_examen);
    }

    /*El metodo calculoMedia retorna un valor de tipo double, este valor se calcula a partir de las notas
     * de la practica y del examen, asi obteniendo la media que el valor retornado*/
    public double calculoMedia(){
        double media;
        media = ((nota_practica*0.6)+(nota_examen*0.4));
        return media;
    }

    /*El siguiente metodo sirve para determinar si has aprobado el examen, esto a partir de valores booleanos que
     * si cumplen la condicion devolveran ya sea un true o un false.*/
    public boolean aprobarExamen(){
        boolean nota_minima = ((nota_practica>=5) && (nota_examen>=5));
        boolean media_aprobada = (calculoMedia()>=5);
        if(nota_minima && media_aprobada){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Practica3 h = new Practica3();

        h.imprimirNotas();
        System.out.println("\nLa nota media es: " + h.calculoMedia());
        System.out.println("\nEl alumno aprobo la asignatura: " + h.aprobarExamen());
    }
}
