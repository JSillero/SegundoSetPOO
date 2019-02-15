package segundatandaPOO;
/**
 * 
 * he obviado la prueba de terminal y la he cambiado por la de movil, funciona correctamente en ambos casos.
 * @author d18sisaj
 *
 */
public class Pruebaejercicio8Terminal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Movil t1 = new Movil ("678 11 22 33","mono");
    Movil t2 = new Movil("644 74 44 69","rata");
    Movil t3 = new Movil("622 32 89 09","bisonte");
    Movil t4 = new Movil("664 73 98 18","mono");
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t2.llama(t3, 200);
    t3.llama(t4, 200);
    t4.llama(t2, 320);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }

}
