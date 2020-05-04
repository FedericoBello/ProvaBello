
public class Iscritti {
	private String nome;
	private String cognome;
	private String dataN;
	private String dataF;
	private String tipoP;
	private int numG;

	public Iscritti(String n, String c, String dn, String df, String tp, int ng) {
		nome = n;
		cognome = c;
		dataN = dn;
		dataF = df;
		tipoP = tp;
		numG = ng;

	}

	public String getDataF() {
		return dataF;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setDataF(String dataF) {
		this.dataF = dataF;
	}

	public String getTipoP() {
		return tipoP;
	}

	public void incNumG() {
		numG++;
		
	}

	

	public int getNumG() {
		return numG;
	}

	public void setNumG(int numG) {
		this.numG = numG;
	}

	public String toString() {
		return "nome=" + nome + " cognome=" + cognome + " data di nascita =" + dataN + " data del foglio rosa=" + dataF
				+ " tipo di patente=" + tipoP + " numero di guide=" + numG;
	}

	public static void main(String[] args) {
		Iscritti i = new Iscritti("Federico", "Bello", "28/06/2002", "30/05/2020", "A1", 4);
		System.out.println(i);
	}
}
