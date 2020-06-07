package edunova;

import javax.swing.JOptionPane;

public class TrgovinaSwitchIf {
	
	
  public static void main(String[] args) {
	  
	
		int dzeparac = Integer.parseInt(JOptionPane.showInputDialog("Koliko imate dzeparca?")); 
		int proizvodZakupiti =Integer.parseInt(JOptionPane.showInputDialog("Sto zelite kupiti 1: cokolada, 2: sladoled, 3: keks "));
		int kolicina = Integer.parseInt(JOptionPane.showInputDialog("Odaberite kolicinu:"));
		int cijena =0;
		
		switch(proizvodZakupiti) {
		case 1:
			cijena = 15;
			break;
		case 2: 
			cijena =10;
			break;
		case 3:
			cijena = 20;
			break;
		}
		
		
		 int kusur = dzeparac - (kolicina*cijena);
		 if (kusur < 0) {
			 System.out.println("Nemate dovoljno sredstava!");
		 }else {
		 
		System.out.printf("Ostaje vam %d kuna, ",kusur);
		System.out.printf("kupili ste %d komad/a ", kolicina);
		
		switch(proizvodZakupiti) {
		case 1:
			System.out.println("cokolada/e\n");
			break;
		case 2: 
			System.out.println("sladoled/a\n");
			break;
		case 3: 
			System.out.println("keks/a\n");
			
		}
		int podijeliSvima = Integer.parseInt(JOptionPane.showInputDialog("Na koliko osoba zelite podijeliti?"));
		int modulo = kolicina%podijeliSvima;
		System.out.printf("Vama ostaje %d komad/a", modulo );
		 }
		 
		
		/*++kolicina;
		++modulo;
		System.out.println(modulo);*/
		
  }
  
  

  
	}
    





