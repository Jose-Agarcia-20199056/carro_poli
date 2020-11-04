package dealer_polim;

 // clase padre
public class carro {
    // declaracion de variables
    protected String marca;
    protected String modelo;
    protected int puertas; 
    boolean encendido ;
    // metodo constructor  
    public carro(String marca, String modelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public String getMarca() { // metodo get para obtener valores privados o protegidos 
        return marca;
    }

    public void setMarca(String marca) { // metoddo set modificar el valor de las variables o atributos
        this.marca = marca;
    }

    public String getModelo() {  // metodo get para obtener valores privados o protegidos
        return modelo;
    }

    public void setModelo(String modelo) { // metoddo set modificar el valor de las variables o atributos
        this.modelo = modelo;
    }

    public int getPuertas() { // metodo get para obtener valores privados o protegidos
        return puertas;
    }

    public void setPuertas(int puertas) { // metoddo set modificar el valor de las variables o atributos
        this.puertas = puertas;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public String obtenermodelo(){ // que devolvera el valor de los atributos por pantalla al ser invocados
      return "Marca: "+marca+"/nModelo: "+modelo+"/nPuertas: "+puertas;
    }
    public void encender(){
     encendido = true;
     if(encendido){
     System.out.println("estado: encendido");
     }
     else{
     System.out.println("estado: apagado");    
     }    
    }
    public void apagar(){
    encendido = false;
     if(encendido){
     System.out.println("estado: encendido");
     }
     else{
     System.out.println("estado: apagado");    
     }    
     
    }
}
