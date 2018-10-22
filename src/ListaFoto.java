import java.util.*;

public class ListaFoto {

	private int indice = 0;
	private Foto[] listaFoto;
	Scanner sc = new Scanner(System.in);

	public ListaFoto(int dimensione) {
		listaFoto = new Foto[dimensione];
	}

	public boolean aggiungiFoto(Foto f, int dimensione) {
		if (indice < dimensione) {
			listaFoto[indice++] = f;
			return true;
		}
		return false;
	}

	public void contaTag() {
		String nome;
		int conta = 0;
		System.out.println("Inserisci il nome dell'amico ");
		nome = sc.nextLine();
		for (int i = 0; i < listaFoto.length; i++) {
			if (nome.equals(listaFoto[i].tag))
				conta++;
		}
		if (conta == 0) {
			System.out.println("Il nome inserito non corrisponde a nessun amico");
		} else {
			System.out.println("L'amico " + nome + " è stato taggato in " + conta + " foto");
		}
	}

	public void amicoPiuTaggato() {
		
	}
}
