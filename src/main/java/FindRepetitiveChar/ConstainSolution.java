package FindRepetitiveChar;

public class ConstainSolution {
    public static void main(String[] args) {
        String characters="ALKSSACD";
        System.out.println(findRepetitiveCharWithContains(characters));
    }

    private static char findRepetitiveCharWithContains(String characters) {
        String newcharacters;
        for (int i = 0; i < characters.length(); i++) {
            newcharacters = characters.substring(i+1, characters.length());
            if (newcharacters.contains(characters.charAt(i) + "")) {
                return characters.charAt(i);
            }else
                continue;
        }
        return ' ';
    }

}
