package parole;

import java.util.ArrayList;

public class AlienDictionary {

	private ArrayList<Word> ArrayParole=new ArrayList<Word>();

	public void addWord(String alienWord, String translation) {
		ArrayParole.add(new Word(alienWord,translation));
	}

	public String translateWord(String alienWord) {
		for(int i=0; i<ArrayParole.size(); i++) {
			if(alienWord.equalsIgnoreCase(ArrayParole.get(i).getAlienWord())) {
				return ArrayParole.get(i).getTranslation();
			}
		}
		return null;
	}
	public String scelta(String textField) {
		try {		
			if(textField.indexOf(' ')!= -1) {
				int pos1=textField.indexOf(' ');
				String Parola1=textField.substring(0, pos1-1);
				String Parola2=textField.substring(pos1+1);
				String Parola3=Parola2.trim();
				System.out.println(Parola1+";"+Parola3);
				addWord(Parola1, Parola3);
				return "Parola aggiunta";
			}else {
				System.out.println("sono nel translate");
				String s=translateWord(textField);
				if(s!=null) {
					return s;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return "Hai messo uno spazio di troppo per la traduzione!";
		}catch(Exception e) {
			return "Hai sbagliato qualcosa, riprova!";
		}
		return null;
	}

}
