package segundatandaPOO;
/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.
Contenido del main

 * @author d18sisaj
 *
 */

/**
 * Necesito una clase to string, una clase llamada que incremente el tiempo de dos
 *  entidades la que llama y la llmada y un constructor normal porque no me especifica que tenga restricciones
 *  
 * @author d18sisaj
 *
 */
public class Terminal {
  protected String numero;
  protected int tiempo;
  
  public Terminal(String n) {
    this.numero=n;
    this.tiempo=0;
  }
  public String toString() {
    return("Nº "+this.numero+" - "+String.valueOf(this.tiempo)+" s de conversación.");
  }
  public void llama(Terminal t, int tiem) {
    this.tiempo+=tiem;
    t.tiempo+=tiem;
  }
}
