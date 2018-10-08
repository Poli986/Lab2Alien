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
		for(int i=0; i<textField.length(); i++){
    		if(textField.charAt(i)==' '){
    			String nuovoArray[]=textField.split(" ");
    			addWord(nuovoArray[0], nuovoArray[1]);
    			return "Parola aggiunta";
    		}else {
    			String s=translateWord(textField);
    			if(s!=null) {
    				return s;
    			}
    		}
    	}
		return null;
	}

}
