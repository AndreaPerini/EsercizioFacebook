import java.util.*;

public class Avvia {

	public static void main(String[] args) {

		int scelta;
		int x = 0;
		int y = 0;
		boolean controllo = false;
		boolean amiciiniz = false;
		boolean fotoiniz = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Inserisci il numero corrispondente al metodo da eseguire: ");
			System.out.println("1 = Inserisci amici");
			System.out.println("2 = Inserisci foto");
			System.out.println("3 = Controlla quante volte un amico è stato taggato");
			System.out.println("4 = Guarda chi è l'amico più taggato");
			System.out.println("5 = Termina");
			System.out.println("Sappi che per eseguire i metodi 3 e 4 devi eseguire i metodi 1 e 2 almeno una volta");
			scelta = sc.nextInt();
			switch (scelta) {
			case 1:
				System.out.println("Inserisci il numero di amici da aggiungere: ");
				x = sc.nextInt();
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
				amiciiniz = true;
				break;
			case 2:
				System.out.println("Inserisci il numero di foto da aggiungere: ");
				y = sc.nextInt();
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
				fotoiniz = true;
				break;
			case 3:
				if (amiciiniz == true && fotoiniz == true) {
					ListaFoto ogg1 = new ListaFoto(y);
					ogg1.contaTag();
				} else {
					if (amiciiniz == false) {
						System.out.println("Devi creare almeno un amico");
					}
					if (fotoiniz == false) {
						System.out.println("Devi caricare almeno una foto");
					}
				}
				break;
			case 4:
				if (amiciiniz == true && fotoiniz == true) {
					ListaFoto ogg2 = new ListaFoto(y);
					ogg2.amicoPiuTaggato();
				} else {
					if (amiciiniz == false) {
						System.out.println("Devi creare almeno un amico");
					}
					if (fotoiniz == false) {
						System.out.println("Devi caricare almeno una foto");
					}
				}
				break;
			case 5:
				controllo = true;
				break;
			default:
				System.out.println("Inserimento errato");
			}
		} while (controllo = true);
		sc.close();
	}
}