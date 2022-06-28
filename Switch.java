public class Switch {
    public static void main(String[] args){
        String profesor = "Juan";
        switch (profesor){
            case "Juan":
                System.out.println("Tiene asignados los grupos 12, 21, 46 y 53");
                break;
            case "Marina":
                System.out.println("Tiene asignados los grupos 04, 20, 45 y 54");
                break;   
            case "Pedro":
                System.out.println("Tiene asignados los grupos 03, 25, 48 y 60"); 
                break; 
            default:
                System.out.println("El profesor no existe");  
        }
    }
}
