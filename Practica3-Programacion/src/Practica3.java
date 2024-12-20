/**
 * Clase que evalúa la entrega de actividades y cálculos de notas en una práctica.
 * Proporciona métodos para calcular medias y determinar si un estudiante aprobó.
 *
 * @author Joaquin Puchuri Tunjar
 * @version 1.0
 */
public class Practica3 {

    private boolean actividades_entregadas;
    private double nota_practica;
    private double nota_examen;

    /**
     * Constructor por defecto que inicializa los atributos con valores predeterminados.
     */
    public Practica3() {
        actividades_entregadas = true;
        nota_practica = 7.5;
        nota_examen = 5.5;
    }

    /**
     * Metodo que imprime las notas de la práctica y del examen, indicando si se entregaron actividades.
     */
    public void imprimirNotas() {
        System.out.println("La nota de clase es la siguiente: ");
        if (actividades_entregadas) {
            System.out.println("\nSe han entregado las actividades del tema.");
        }
        System.out.println("Nota de prácticas: " + nota_practica);
        System.out.println("Nota de examen: " + nota_examen);
    }

    /**
     * Calcula la nota media del estudiante.
     * @return la nota media ponderando 60% la práctica y 40% el examen.
     */
    public double calculoMedia() {
        return ((nota_practica * 0.6) + (nota_examen * 0.4));
    }

    /**
     * Determina si el estudiante aprobó el examen.
     * @return true si el estudiante aprobo o false si no.
     */
    public boolean aprobarExamen() {
        boolean nota_minima = ((nota_practica >= 5) && (nota_examen >= 5));
        boolean media_aprobada = (calculoMedia() >= 5);
        return nota_minima && media_aprobada;
    }

    public static void main(String[] args){
        Practica3 h = new Practica3();

        h.imprimirNotas();
        System.out.println("\nLa nota media es: " + h.calculoMedia());
        System.out.println("\nEl alumno aprobo la asignatura: " + h.aprobarExamen());
    }
}