import java.util.*;

public class Avvia {

	public static void main(String[] args) {

		int scelta;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Inserisci il numero corrispondente al metodo da eseguire: ");
			System.out.println("1 = Inserisci amici");
			System.out.println("2 = Inserisci foto");
			System.out.println("3 = Controlla quante volte un amico è stato taggato");
			System.out.println("4 = Guarda chi è l'amico più taggato");
			System.out.println("5 = Termina");
			scelta = sc.nextInt();
			switch (scelta) {
			case 1:
				System.out.println("Inserisci il numero di amici da aggiungere: ");
				int x = sc.nextInt();
				ListaAmici l1 = new ListaAmici(x);

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

					// System.out.println(a.getNome());
					// System.out.println(a.getCognome());
					// System.out.println(a.getEta());
				}
				break;
			case 2:
				System.out.println("Inserisci il numero di foto da aggiungere: ");
				int y = sc.nextInt();
				ListaFoto l2 = new ListaFoto(y);

				Foto f;
				String t, z;

				for (int i = 0; i < y; i++) {
					System.out.println("Inserisci titolo foto: ");
					t = sc.nextLine();
					System.out.println("Inserisci il nome dell'amico da taggare: ");
					z = sc.nextLine();
					f = new Foto(t, z);
					l2.aggiungiFoto(f, y);
				}
				break;
			case 3:
				//ListaFoto ogg = new ListaFoto.contaTag();
				//ListaFoto.contaTag();
				break;
			case 4:
				//amicoPiuTaggato();
				break;
			case 5:
				flag = true;
				break;
			default:
				System.out.println("Inserimento errato");
			}
		} while (flag = true);
		sc.close();
	}
}