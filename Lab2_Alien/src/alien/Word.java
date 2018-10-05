package alien;

import java.util.ArrayList;

public class Word {
	
	private static ArrayList<Word> ArrayParole=new ArrayList<Word>();
	private String alienWord;
	private String translation;
	
	String getAlienWord() {
		return alienWord;
	}


	String getTranslation() {
		return translation;
	}


	Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
		ArrayParole.add(new Word(alienWord, translation));
	}


	@Override
	public boolean equals(Object obj) {
		for(int i=0; i<ArrayParole.size(); i++) {
			if(ArrayParole.get(i).getAlienWord().equalsIgnoreCase((String)obj)){
				System.out.println("Parola già presente nel dizionario!");
			}
		}
		return true;
	}

}
