package dealer_polim;
import java.util.Scanner;
/**
 *
 * @author ginag
 */
public class Dealer_polim {

    /**
     * @param arg
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); // clase de entrada de datos por teclado
      carro so= new sonata("14/5/2020","Hyundai","n20",4); //  objeto 1 aplicando el poli morfismo
      carro so2= new sonata("30/7/2020","Hyundai","y20",4); // objeto 2 aplicando el poli morfismo
      so2.setModelo("tucsson"); // aqui aplicamos el set para modificar  la forma del objeto
      carro toyo= new toyota("2/2/2020","Toyota","supra",2);// objeto 3 aplicando el poli morfismo
      carro toyo2= new toyota("4/6/2020","Toyota","corolla",4); // objeto4 aplicando el poli morfismo
      toyo.setModelo("Yaris");// aqui aplicamos el set para modificar  la forma del objeto
      carro ford1 = new ford("11/1/2020","Ford","Focus",2);// objeto 5 aplicando el poli morfismo
      carro ford2 = new ford("18/6/2020","Ford","Explorer",4);// objeto 6 aplicando el poli morfismo
      ford1.setModelo("Raptor");// aqui aplicamos el set para modificar  la forma del objeto
      ford1.setPuertas(4);// aqui aplicamos el set para modificar  la forma del objeto
      int select = 0; //Iniciacion y Declaraion de variables 
       
       do // do para iterar el menu 
       {    // Aqui mostramos el menu por pantalla  
           System.out.println("^^Bienvenido al dealer el carero^^");
           System.out.println("^^Seleccione el carro que desea ver^^");
           System.out.println("");
           System.out.println("01-Hyndai");
           System.out.println("02-Toyota");
           System.out.println("03-Ford");
           System.out.println("00-Salir");
           select = entrada.nextInt(); // En esta variable guardamos la eleccion del usuario
           
           switch(select){
               
               case 1 :
               {   // Aqui se mostraran los carros hyndai
                System.out.println("^^Estos son los carros Hyndai^^"); 
                System.out.println(so.obtenermodelo());
                System.out.println("");
                System.out.println(so2.obtenermodelo());
                System.out.println("");
                break;
               }    
               
               
               case 2 :
               {    // Aqui se mostraran los carros Toyota
                System.out.println("^^Estos son los carros Toyota^^"); 
                System.out.println(toyo.obtenermodelo());
                System.out.println("");
                System.out.println(toyo2.obtenermodelo());
                System.out.println("");
                break;
               
               }
               case 3 :
               {  // Aqui se mostraran los carros Ford
                System.out.println("^^Estos son los carros ^^"); 
                System.out.println(ford1.obtenermodelo());
                System.out.println("");
                System.out.println(ford2.obtenermodelo());
                System.out.println("");
                break;
               
               }
           default:// este default indicara al usuario que escribio un numero incorrecto del menu
         System.out.println("ERROR El numero ingresado esta fuera de rango");
        break;
           } 
           
       }while(select!=00);   
       
       System.out.println("Gracias por su visita"); // Despedida del programa 
    }
    
}
  //programa creado por:jose garcia inicializado: 29/10/20 finalizado: 1/11/2