package petljeIListe;

public class Petljevjezba {

	public static void main(String[] args) {
		
		int[][] ploca = new int[10][10];
			
		for(int red = 0; red<ploca.length; red++) {
			for(int stupac = 0; stupac<ploca[red].length; stupac++) {
				ploca[red][stupac] = red*stupac;
				
			}
		}
		for(int red = 0; red<ploca.length; red++) {
	   for(int stupac = 0; stupac<ploca[red].length; stupac++)	{
		   ploca [red][stupac] = red*stupac;
		   System.out.printf(" %5d",ploca[red][stupac] );
	   }
	   System.out.println();
		}
		

	}

}
