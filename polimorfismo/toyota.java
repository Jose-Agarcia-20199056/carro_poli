// clase hija 
public class toyota extends  carro {
    // declaracion de variables
    protected String Dia_de_mantenimiento;
    
     // metodo constructor 
    public toyota(String Dia_de_mantenimiento, String marca, String modelo, int puertas) {
        super(marca, modelo, puertas);
        this.Dia_de_mantenimiento = Dia_de_mantenimiento;
    }

    public String getDia_de_mantenimiento() { // metodo get para obtener valores privados o protegidos 
        return Dia_de_mantenimiento;
    }

    public void setDia_de_mantenimiento(String Dia_de_mantenimiento) {// metoddo set modificar el valor de las variables o atributos
        this.Dia_de_mantenimiento = Dia_de_mantenimiento;
    }
   @Override // aqui sobre escribimos el metodo obtener datos de la calse padre
    public String obtenermodelo(){
      return  "Fecha de mantenimiento: "+Dia_de_mantenimiento+"\nMarca: "+marca+"\nModelo: "+modelo+"\nPuertas: "
        +puertas;
    }    
}