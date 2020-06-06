package mojiProjekti;

import javax.swing.JOptionPane;

public class SwitchiIfVjezbe {

	public static void main(String[] args) {
		
				//JEDNOSTAVNI KALKULATOR

		/*int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upisi prvi broj:"));
		char op   =JOptionPane.showInputDialog("Upisi zeljenu opciju (+ - * / ").charAt(0); 
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upisi drugi broj:"));
		
		int rezultat = 0;
		
		if (op == '+') {
			rezultat = broj1 + broj2;
			
		}
		if (op == '-') {
			rezultat = broj1 - broj2;
			
		}
		else if (op == '*') {
			rezultat = broj1 * broj2;
		}
		
		else if (op == '/') {
			rezultat = broj1 / broj2;
		}
		
	System.out.println(rezultat);
	
		//char ch=JoptionPane.showInputDialog(this,"enter the alphabet").charAt(0);
		*/
		 
				//PARNI NEPARNI BROJ ILI 0
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj:"));
		
		if (broj > 0) {
		System.out.println("Broj je pozitivan");
		
		}
		else if (broj < 0) {
			System.out.println("Broj je negativan");
		}
		else if (broj == 0){
			System.out.println(0);
		}
		
		        //Mjeseci i broj dana u mjesecu
			int mjesec = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj mjeseca:"));
			
			switch(mjesec) {
			
			case 1: 
				System.out.println("Sijecanj\t");
				break;
			case 2: 
				System.out.println("Veljaca");
				break;
			case 3:
				System.out.println("Ozujak");
				break;
			case 4: 
				System.out.println("Travanj");
				break;
			case 5: 
				System.out.println("Svibanj");
				break;
			case 6: 
				System.out.println("Lipanj");
				break;
			case 7: 
				System.out.println("Srpanj");
				break;
			case 8: 
				System.out.println("Kolovoz");
				break;
			case 9: 
				System.out.println("Rujan");
				break;
			case 10: 
				System.out.println("Listopad");
				break;
			case 11:
				System.out.println("Studeni");
				break;
			case 12: 
				System.out.println("Prosinac");
				break;
				
				default: 
					System.out.println("Unesen je krivi broj!");
			}
			if (mjesec == 1) {
				System.out.println("31 dan");
				}
			else if (mjesec == 2) {
				System.out.println("28/29 dana");
			}
			else if (mjesec == 3 ) {
				System.out.println("31 dan");
			}
			else if (mjesec == 4) {
			System.out.println("30 dana");
			}
			// itd...
		    
		
		//char[] samoglasnik = {'A', 'E','I', 'O', 'U'};
	
		char slovo = JOptionPane.showInputDialog("Upisi slovo:").charAt(0);
		
		switch(slovo) {
		case 'a': 
			System.out.println("samoglasnik");
			break;
		case 'A':
			System.out.println("samoglasnik");
		case 'e':
			System.out.println("samoglasnik");
			break;
		case 'E':
			System.out.println("samoglasnik");
			break;
		case 'o': 
			System.out.println("samoglasnik");
			break;
		case 'O': 
			System.out.println("samoglasnik");
			break;
		case 'i': 
			System.out.println("samoglasnik");
			break;
		case 'I':
			System.out.println("samoglasnik");
			break;
		case 'u':
			System.out.println("samoglasnik");
			break;
		case 'U':
			System.out.println("samoglasnik");
		   break;
	
		    default: 
			 System.out.println("suglasnik");
		}
	}
	  }
	


