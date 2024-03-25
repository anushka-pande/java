class CharacterCounts {
    public static void main(String[] args) {
        String str = "Hello World! @ # $%^123 &*()-_=+|{}[];:,<>.?/`~"; 
        str = str.toLowerCase();
        
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int symbolCount = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } 
                else {
                    consonantCount++;
                }
            } 
            else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } 
            else if (ch == ' ') {
                spaceCount++;
            }	
            else if(ch == '!'|| ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '_' || ch == '=' || ch == '+' || ch == '|' || ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == ';' || ch == ':' || ch == ',' || ch == '<' || ch == '.' || ch == '>' || ch == '/' || ch == '?' || ch == '`' || ch == '~') {
            	symbolCount++;
            }
        }
        
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of white spaces: " + spaceCount);
        System.out.println("Number of symbols: " + symbolCount);
    }
}

