/**
 *	Classe RehoNicoloClass 	 
 *   @author <b>Reho Nicolo</b>
 *   <U>4BI</U>
 *   <i>11\05\2022</i>
 *   @version 2.0
 *
 */
public class RehoNicoloClass {
	/**
	 * Costruttore classe RehoNicoloClass
	 */
	
	public RehoNicoloClass() {}
	/**
	 * Sommatoria
	 * metodo che restituisce la somma dei numeri interi compresi fra l'indice iniziale G 
	 * @param f indice iniziale
	 * @return r somma
	 */
	public int RehoMet(int f) {
		int r = 0;
		for(int i=f; i>0;i--) {
			r = r+i;
		}
		return r;
	}
	public static void main(String[]args) {
		RehoNicoloClass c = new RehoNicoloClass();
		System.out.println(c.RehoMet(5));
	}
}
