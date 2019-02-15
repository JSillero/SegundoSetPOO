package segundatandaPOO;
/**
 * 
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.
 * 
 * @author d18sisaj
 *
 */
public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;
  /**
   * El constructor esta implementado de forma que funcione correctamente con valores negativos aunque nunca bajara de 0/0/0
   * @param h
   * @param m
   * @param s
   */
  public Tiempo(int h, int m, int s) {
    this.horas=h;
    this.minutos=m;
    this.segundos=s;
    if(this.segundos>59) {
      this.minutos+=this.segundos/60;
      this.segundos=this.segundos%60;
      
    }
    if(this.minutos>59) {
      this.horas+=this.minutos/60;
      this.minutos=this.minutos%60;
      
    }
    
    while(this.segundos<0) {
      this.minutos-=1;
      this.segundos+=60;   
    }
    while(this.minutos<0) {
      this.horas-=1;
      this.minutos+=60;   
    }
    if(this.horas<0) {
      this.horas=0;
      this.minutos=0;
      this.segundos=0;
      System.out.println("El tiempo total es negativo por lo que se ha reducido a 0h 0m 0s");
    }  
  
  }
  public String toString() {
    return (String.valueOf(this.horas)+"h "+String.valueOf(this.minutos)+"m "+String.valueOf(this.segundos)+"s");
  }
  /**
   * El metodo se puede usar para sumar o restar sin problema, sin embargo el tiempo no bajarámas de 0h 0m 0s
   * 
   * @param h
   * @param m
   * @param s
   */
  public void suma(int h, int m, int s) {
    this.horas+=h;
    this.minutos+=m;
    this.segundos+=s;
    
    if(this.segundos>59) {
      this.minutos+=this.segundos/60;
      this.segundos=this.segundos%60;
      
    }
    
    if(this.minutos>59) {
      this.horas+=this.minutos/60;
      this.minutos=this.minutos%60;
      
    }
    
    while(this.segundos<0) {
      this.minutos-=1;
      this.segundos+=60;   
    }
    while(this.minutos<0) {
      this.horas-=1;
      this.minutos+=60;   
    }
    if(this.horas<0) {
      this.horas=0;
      this.minutos=0;
      this.segundos=0;
      System.out.println("El tiempo total es negativo por lo que se ha reducido a 0h 0m 0s");
    }
  }
}
