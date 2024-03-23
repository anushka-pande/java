class VowelOrConsonant {
	public static void main(String[] args) {
		VowelOrConsonant alphabet = new VowelOrConsonant();
		char c = 'x';
		
		if(alphabet.isVowel(c)) {
			System.out.println("'" + c + "'" + " is a vowel");
		}
		else {
			System.out.println("'" + c + "'" + " is a consonant");
		}
	}
	public boolean isVowel(char c) {
		return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
	}
}
