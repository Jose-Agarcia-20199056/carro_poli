public class sonata extends carro {
    // declaracion de variables 
    private String Fecha_de_entrada;
     
     // metodo constructor  
    public sonata(String Fecha_de_compra, String marca, String modelo, int puertas) {
        super(marca, modelo, puertas);
        this.Fecha_de_entrada = Fecha_de_compra;
    }

    public String getFecha_de_compra() { // metodo get para obtener valores privados o protegidos 
        return Fecha_de_entrada;
    }

    public void setFecha_de_compra(String Fecha_de_compra) { // metoddo set modificar el valor de las variables o atributos
        this.Fecha_de_entrada = Fecha_de_compra;
    }
    
    @Override // aqui sobre escribimos el metodo obtener datos de la calse padre
    public String obtenermodelo(){
      return  "Fecha de adquisicion: "+Fecha_de_entrada+"\nMarca: "+marca+"\nModelo: "+modelo+"\nPuertas: "
        +puertas;
    }
}
