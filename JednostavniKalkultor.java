package mojiProjekti;

import javax.swing.JOptionPane;

public class JednostavniKalkultor {

	public static void main(String[] args) {

		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Upisi prvi broj:"));
		char op   =JOptionPane.showInputDialog("Upisi zeljenu opciju (+ - * /) ").charAt(0); 
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
		
		
	}

}
