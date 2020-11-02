// clase hija 
public class ford extends carro {
     // declaracion de variables
    private String cambio_de_aceite;
    
    // metodo constructor 
    public ford(String cambio_de_aceite, String marca, String modelo, int puertas) {
        super(marca, modelo, puertas);
        this.cambio_de_aceite = cambio_de_aceite;
    }

    public String getCambio_de_aceite() { // metodo get para obtener valores privados o protegidos 
        return cambio_de_aceite;
    }

    public void setCambio_de_aceite(String cambio_de_aceite) {// metoddo set modificar el valor de las variables o atributos
        this.cambio_de_aceite = cambio_de_aceite;
    }
    
    @Override // aqui sobre escribimos el metodo obtener datos de la calse padre
    public String obtenermodelo(){
      return  "Fecha de Cambio de aceite: "+cambio_de_aceite+"\nMarca: "+marca+"\nModelo: "+modelo+"\nPuertas: "
        +puertas;
    }    
}