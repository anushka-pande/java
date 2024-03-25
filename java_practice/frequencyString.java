class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world"; 
        str = str.toLowerCase();
        
        int[] frequency = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequency[ch]++;
            }
        }
        
        System.out.println("Character frequencies:");
        for (char c = 'a'; c <= 'z'; c++) {
            if (frequency[c] > 0) {
                System.out.println("'" + c + "' occurs " + frequency[c] + " times");
            }
        }
    }
}

