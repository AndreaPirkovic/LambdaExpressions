package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		OkreniString os= (str)-> {
			
			String rezultat= "";
			for (int i = str.length() -1;i>=0; i--)
				rezultat+= str.charAt(i); // uzimanje elelenta iz string niza na poziciji i
			return rezultat;
				
		}; // lambda izraz sa viticastom zagradom se zavrsava sa znakom tackazarez;
		System.out.println("tekst  " + os.OkreniString("tekst"));
		System.out.println(" java obrnuto  " + os.OkreniString("Java"));

	}

}
