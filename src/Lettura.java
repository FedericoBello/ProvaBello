import java.util.Scanner;
import javax.swing.*;

public class Lettura {
	
	public static String leggiStringa(String mess, String tit) {
		String s=JOptionPane.showInputDialog(null,mess,tit,JOptionPane.QUESTION_MESSAGE);
		
		return s;
		
	}
	
	public static int menu(String mess, String tit,ImageIcon imm,String[] voci) { //menu programma
		//parseInt 
		
		String v;
		v=(String)JOptionPane.showInputDialog(null,mess,tit,JOptionPane.QUESTION_MESSAGE,imm,voci,voci[0]);
		
		int i;
		for(i=0;i<voci.length;i++) {
			if(v.compareTo(voci[i])==0) break;
		}		
		
		return i;
		
	}
	
	public static int leggiInt(String mess) {
		int x=-1;
		
		System.out.println(mess);
		
		Scanner in=new Scanner(System.in); //dichiarandola come variabile locale il buffer viene pulito al termine dell'esecuzone del metodo
		x=in.nextInt();
		
		//in.close();
		return x;
	}
	
	public static float leggiFloat(String mess) {
		float x=-1;
		
		System.out.println(mess);
		
		Scanner in=new Scanner(System.in); //dichiarandola come variabile locale il buffer viene pulito al termine dell'esecuzone del metodo
		x=in.nextFloat();
		
		in.close();
		return x;
	}
	
	public static String leggiStringa(String mess) {
		String x=" ";
		
		System.out.println(mess);
		
		Scanner in=new Scanner(System.in); 
		x=in.nextLine();
		
		in.close();
		return x;
	}
	
	public static String leggiParola(String mess) {
		String x=" ";
		
		System.out.println(mess);
		Scanner in=new Scanner(System.in); 
		x=in.next();
		
		in.close();
		return x;
	}
	
	public static char leggiChar(String mess) {
		String x=" ";
		
		System.out.println(mess);
		Scanner in=new Scanner(System.in); 
		x=in.nextLine();
		
		in.close();
		return x.charAt(0);
	}
	
	public static void main(String[] args) {
		String[] voci= {"Esci","Rrima scelta","Seconda scelta"};
		
		int x=menu("Scegli","test",new ImageIcon("Robot_icon.jpg"),voci);
		
		System.out.println("Scelta: "+x);
	}
}

