public class principalAgre {
    public static void main(String[] args) {
        EstudianteAgre est1 = new EstudianteAgre("María", 123456, "Mr. Juan");
        EstudianteAgre est2 = new EstudianteAgre("Carlos", 456789, "Mr. Juan");
        EstudianteAgre est3 = new EstudianteAgre("Lisa", 987654, "Mr. Omar");
        EstudianteAgre est4 = new EstudianteAgre("Ana", 654321, "Mr. Omar");
        String[] listaEstOmar = {est3.nombre, est4.nombre};
        String[] listaEstJuan = {est1.nombre, est2.nombre};
        ProfesorAgre profeOmar = new ProfesorAgre("Omar", listaEstOmar);
        ProfesorAgre profeJuan = new ProfesorAgre("Juan", listaEstJuan);
        String[] listaEst1 = profeOmar.getEstudiantes();
        String[] listaEst2 = profeJuan.getEstudiantes();
        System.out.println("Estudiante profesor Omar:");
        for(String i: listaEst1){
            System.out.println(i);
        }
        System.out.println("Estudiantes profesor Juan:");
        for(String i: listaEst2){
            System.out.println(i);
        }
        
    }
    
}
