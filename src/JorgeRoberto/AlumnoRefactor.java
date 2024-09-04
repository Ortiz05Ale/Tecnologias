package JorgeRoberto;

public class AlumnoRefactor extends PersonaRefactor implements Actividad{
    private int calificacion;

    public AlumnoRefactor(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Calificacion: " + calificacion);
    }

    public void  realizarExamen(){
        System.out.println(getNombre() + " está realizando examen" );
    }
}
