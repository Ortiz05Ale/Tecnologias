package BloqueI.JorgeRoberto;

public class Main2{
    public static void main(String[] args) {
        AlumnoRefactor alumno = new AlumnoRefactor("Alegria", 8);
        MaestroRefactor maestro = new MaestroRefactor("Magdielito.com", "Base de datos");

        alumno.mostrarInfo();
        maestro.mostrarInfo();

        alumno.realizarExamen();
    }
}
