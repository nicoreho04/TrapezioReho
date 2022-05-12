/**
 * classe RegoNicolo
 * @author <b>Reho Nicolo</b>
 * <U> 4 BI </U>
 * <i>12/05/2022</i>
 * @version 2.0
 *
 */
public class RegoNicolo {
/**
 * costruttore RegoNicolo	
 */
	public RegoNicolo()
	{}
/**
 * metodo sommatoria	
 * @param f indice iniziale
 * @return r sommaotria
 */
	public int rehoMet(int f) {
		int r = 0;
		for(int i=f; i>0; i--) {
			r = r+1;
		}
		return r;
	}
	public static void main(String[] args) {
		RegoNicolo n = new RegoNicolo();
		System.out.println(n.rehoMet(5));
	}

}
