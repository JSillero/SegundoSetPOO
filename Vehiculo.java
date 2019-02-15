package segundatandaPOO;

/**
 * 
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:

 * @author d18sisaj
 *
 */
public abstract class Vehiculo{
    protected static int vehiculosCreados=0;
    protected static int kilometrosTotales=0;
    private int kilometrosRecorridos=0;
    
     Vehiculo() {
      vehiculosCreados+=1;
    }
     protected void Avanza(int s) {
      this.kilometrosRecorridos+=s;
      kilometrosTotales+=s;
    }
    protected int Getter() {
      return this.kilometrosRecorridos;
    }
    protected int GetterT() {
      return kilometrosTotales;
    }
}



