package parole;

public class Word {
	private String stringaIntera;
	private String alienWord;
	private String translation;

	public String getStringaIntera() {
		return stringaIntera;
	}

	public void setStringaIntera(String stringaIntera) {
		this.stringaIntera = stringaIntera;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public Word(String alienWord, String translation) {
		this.stringaIntera = alienWord+" "+translation;
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
}