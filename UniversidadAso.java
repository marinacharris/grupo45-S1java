public class UniversidadAso {
    private String nombre;
    private String[] facultades;
    public UniversidadAso(String nombre, String[] facultades){
        this.nombre = nombre;
        this.facultades = facultades;
    }
    public String getNombre(){
        return nombre;
    }
    public String[] getFacultades(){
        return facultades;
    }
    
}
