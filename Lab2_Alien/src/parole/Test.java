package parole;

public class Test {

	public static void main(String[] args) { 
		AlienDictionary ad=new AlienDictionary();
		String textField="badunga ciao";
		System.out.println("Roba nuova: "+textField);
		System.out.println(ad.scelta(textField));
		String textField1="badunga";
		System.out.println("Roba aliena: "+textField1);
		System.out.println("Roba italiana: "+ad.scelta(textField1));   	
	}

}
