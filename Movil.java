package segundatandaPOO;
import java.text.DecimalFormat;
/**
 * Movil m1 = new Movil("678 11 22 33", "rata");
Movil m2 = new Movil("644 74 44 69", "mono");
Movil m3 = new Movil("622 32 89 09", "bisonte");
System.out.println(m1);
System.out.println(m2);
m1.llama(m2, 320);
m1.llama(m3, 200);
m2.llama(m3, 550);
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
 * 
 * @author d18sisaj
 *
 */
public class Movil extends Terminal {
  public String tarifa;
  public float deuda=0;
  DecimalFormat tdinero = new DecimalFormat("0.00 euros");
  /**
   * 
   * @param n numero
   * @param tar La tarifa solo pude ser "rata" "mono" o "bisonte"
   */
  public Movil(String n, String tar) {
    super(n);
    this.tarifa=tar;
  }
  public String toString() {
    return("Nº "+this.numero+" - "+String.valueOf(this.tiempo)+" s de conversación - tarifados "+tdinero.format(this.deuda));
  }
  public void llama(Movil ajeno, int tiem) {
    this.tiempo+=tiem;
    ajeno.tiempo+=tiem;
    if(this.tarifa.equals("rata")) {
      this.deuda+=this.tiempo*0.6/60;
    }else if(this.tarifa.equals("mono")) {
      this.deuda+=this.tiempo*0.12/60;
    }else {
      this.deuda+=this.tiempo*0.30/60;
    }
  }
}

  

