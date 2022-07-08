public class ProfesorAgre {
    protected String nombre;
    private String[] estudiantes;
    public ProfesorAgre(String nombre, String[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes; 
    }
    //getter
    public String[] getEstudiantes() {
        return estudiantes;
    }
    
}
