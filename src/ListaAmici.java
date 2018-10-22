public class ListaAmici {

	private int indice = 0;
	private int id = 0;
	private Amici[] listaAmici;

	public ListaAmici(int dimensione) {
		listaAmici = new Amici[dimensione];
	}

	public boolean aggiungiAmico(Amici a, int dimensione) {
		if (indice < dimensione) {
			listaAmici[indice++] = a;
			id += indice++;
			return true;
		}
		return false;
	}
	
	
	//public void taggaAmico (Amici.nome, Amici.cognome, Foto.titolo){

	//}
	
	
	
	
}