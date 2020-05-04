
public class AutoScuola {
	private Iscritti[] scuola;
	private int pos;

	public AutoScuola() {
		scuola = new Iscritti[100];
		pos = 0;
	}

	public void addDati(Iscritti i) {
		scuola[pos] = i;
		pos++;
	}

	public String toString() {
		String p = "SCUOLA \n";
		for (int i = 0; i < pos; i++) {
			p += scuola[i] + "\n";
		}
		return p;
	}

	public void setNumG(int numG, int p) {
		scuola[p].setNumG(numG);
	}

	public void setDataF(String dataF, int po) {
		scuola[po].setDataF(dataF);

	}

	public void setIncNG(int po) {
		scuola[po].incNumG();
	}

	public String StampaF() {
		String p = "senza esame\n";
		for (int i = 0; i < pos; i++) {
			if (scuola[i].getDataF() == "") {
				p += scuola[i] + "\n";
			}
		}
		return p;
	}
	
	public String StampaMag15() {
		String p = "maggiore 15\n";
		for (int i = 0; i < pos; i++) {
			if (scuola[i].getNumG()>=15) {
				p += scuola[i] + "\n";
			}
		}
		return p;
	}
	

	public static void main(String[] args) {
		AutoScuola a = new AutoScuola();
		Iscritti i = new Iscritti("Federico", "Bello", "28/06/2002", "", "A1", 0);
		Iscritti i2 = new Iscritti("222", "222", "28/06/2002", "", "A1", 0);
		a.addDati(i);
		a.addDati(i2);
		 a.setNumG(15,0);
		// a.setNumG(10,1);
		
		 //a.setDataF("12/06/2020",15);
		// a.setDataF("30/02/2020",1);
		 a.setIncNG(0);
		 
		System.out.println(a.toString());
		System.out.println(a.StampaF());
		System.out.println(a.StampaMag15());
	}
}
