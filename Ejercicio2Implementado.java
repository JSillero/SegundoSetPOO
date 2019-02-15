package segundatandaPOO;
import java.util.Scanner;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:

 * 
 * @author d18sisaj
 *
 */
public class Ejercicio2Implementado {

  public static void main(String[] args) {
    int respuesta=0;
    int km=0; //variable usada a la hora de llamar a los metodos para avanzar
    Coche coche = new Coche();
    Bicicleta bici = new Bicicleta();
    Scanner s = new Scanner(System.in);
     for(;respuesta!=8;) {
       System.out.println("VEHICULOS \n=============== \n 1.Anda con la bicicleta \n 2.Haz el caballito con la bicicleta \n 3.Anda con el coche \n 4.Quema rueda con el coche \n 5. Ver el kilometraje de la bicicleta \n 6.Ver el kilometraje del coche \n 7.Ver el kilometraje total \n 8.Salir");
       respuesta=s.nextInt();
       switch(respuesta) {
       
        case 1:
          System.out.println("¿Cuantos kilomtros andamos?");
          km= s.nextInt();
          bici.Avanza(km);
          break;
        case 2:
          bici.Caballito();
          break;
        case 3:
          System.out.println("¿Cuantos kilomtros andamos?");
          km= s.nextInt();
          coche.Avanza(km);
          break;
        case 4:
          coche.quemarRueda();
          break;
        case 5:
     
          System.out.println("La bicicleta ha andado "+String.valueOf(bici.Getter())+" kilometros.");
          break;
        case 6:
          System.out.println("El coche ha andado "+String.valueOf(coche.Getter())+" kilometros. ");
          break;
        case 7:
          System.out.println("La distancia total recorrida es "+String.valueOf(coche.GetterT()+" kilometros."));
          break;
        case 8:
          break;
        default:
          System.out.println("EL numero introducido es invalido, introduzca uno del 1-8");
       }  
     }
     

  }

}
