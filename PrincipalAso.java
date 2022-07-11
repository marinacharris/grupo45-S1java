public class PrincipalAso {
    public static void main(String[] args) {
        FacultadesAso medicina = new FacultadesAso("Medicina", "Juan Gómez");
        FacultadesAso cienciasSociales = new FacultadesAso("Ciencias Sociales", "Ana Guzmán");
        FacultadesAso ingenieria = new FacultadesAso("Ingenierías", "Carlos Castro");
        String[] facultades = {medicina.nombre, cienciasSociales.nombre, ingenieria.nombre};
        UniversidadAso uni1 = new UniversidadAso("UniColombia", facultades);
        String[] facUniColombia = uni1.getFacultades();
        for (String i: facUniColombia){
            System.out.println(i);
        }
    }
    

}
