import java.util.*;

public class Avvia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero di amici da aggiungere: ");
		int x = sc.nextInt();
		ListaAmici l1 = new ListaAmici(x);
		System.out.println("Inserisci il numero di foto da aggiungere: ");
		int y = sc.nextInt();
		ListaFoto l2 = new ListaFoto(y);

		Amici a;
		String n, c;
		int e;

		for (int i = 0; i < x; i++) {
			System.out.println("Inserisci nome e cognome: ");
			n = sc.nextLine();
			c = sc.nextLine();
			System.out.println("Inserisci età: ");
			e = sc.nextInt();
			a = new Amici(n, c, e);
			l1.aggiungiAmico(a, x);
			
			System.out.println(a.getNome());
			System.out.println(a.getCognome());
			System.out.println(a.getEta());
		}
		
		
		
		
		
		
		sc.close();
	}
}