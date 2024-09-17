package BloqueI.JorgeRoberto;

public class MaestroRefactor extends PersonaRefactor{

    private String materia;

    public MaestroRefactor(String nombre,String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Materia " + materia);
    }

}
