public class CarroColecciones {
    private String marca;
    private Double precio;
    public CarroColecciones(String marca){
        this.marca = marca;
    }
    public CarroColecciones(String marca, Double precio){
        this.marca = marca; 
        this.precio = precio;
    }
    //getters
    public String getMarca(){ 
        return marca;
    }
    public Double getPrecio(){ 
        return precio;

    }

}
