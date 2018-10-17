
public class ListaFoto {

	private int indice = 0;
	private Foto[] listaFoto;

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
	
	
}
