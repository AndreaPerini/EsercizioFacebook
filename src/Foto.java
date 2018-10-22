
public class Foto {
	String titolo;
	String tag;

	public Foto(String titolo, String tag) {
		this.titolo = titolo;
		this.tag = tag;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}