import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {
  public static void main(String[] args) {
	  String[] comandi= {"esci","iscrizione","data esame","stampa elenco iscritti"};
	  String nome;
	  String cognome;
	  String dataN;
	  String dataF;
	  String tipoP;
	  int numG;
	  
	  ImageIcon Iconic=new ImageIcon(".png");
	  AutoScuola a = new AutoScuola();
      
  Iscritti is;
  int ricevi;
  boolean ciclo=true;
  while(ciclo){
  	ricevi=Lettura.menu("Seleziona opzione ","MENU",Iconic,comandi);
  	
  	
  	 switch (ricevi) {
     case 0:
     	ciclo=false;
     	break;
     case 1:
    nome=JOptionPane.showInputDialog(null,"inserisci nome");
    cognome=JOptionPane.showInputDialog(null,"inserisci cognome");
    dataN=JOptionPane.showInputDialog(null,"inserisci data di nascita");
    dataF=JOptionPane.showInputDialog(null,"inserisci data dell'esame");
    tipoP=JOptionPane.showInputDialog(null,"inserisci tipo di patente");
    is=new Iscritti(nome,cognome,dataN,dataF,tipoP,0);
    System.out.println(a.toString());
	System.out.println(a.StampaF());
	System.out.println(a.StampaMag15());
   
    break;
     case 2:
    	 
    	 break;
     case 3:
    	 JOptionPane.showMessageDialog(null,a.toString(),"NOTIFICA",JOptionPane.INFORMATION_MESSAGE,Iconic);
    	 System.out.println(a);
    	 break;
    	 
}
  	 }
  
 }
  }
  
