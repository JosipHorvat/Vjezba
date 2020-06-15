package doWhileVjezbe;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CiklicnaTablica {

	public static void main(String[] args) {
		
		
		int max = 100; // maksimalna velicina tablice je 100x100 a min. je 2;
		int x;
		int y;
		int tablica[][] =new int[max][max];   
		
		do {

		 x =Integer.parseInt(JOptionPane.showInputDialog("Upisi broj vodoravnih stupaca"));
		 y =Integer.parseInt(JOptionPane.showInputDialog("Upisi broj okomitih stupaca"));
		}
		while(x>100 || x<2 && y>100 || y<2); 
		
	        for (int i = 0; i<x; i++) {  
			for (int j =0; j<y; j++) { 
				
				System.out.print(tablica[i][j] +" ");  	
			}
			System.out.println(" ");	
		}
	    // input  samo 1 broj te na osnovu njega se formira matrica npr 3 = 3x3      
		// Pronaci nacin kako sa petljom dodati vrijednosti u 2d listu. 
		
		
	     
			
	       
		
        }
}
