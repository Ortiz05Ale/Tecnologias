package JorgeRoberto;

public class PersonaRefactor {
    private String nombre;

    public PersonaRefactor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
    }

}
