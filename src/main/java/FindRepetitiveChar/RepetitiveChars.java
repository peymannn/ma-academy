package FindRepetitiveChar;

public class RepetitiveChars {
    public static void main(String[] args) {
        String characters="ALKCCCD";
        System.out.println(findRepetitiveCharacter(characters));
    }

    private static char findRepetitiveCharacter(String characters) {
        String newCharacters = "";
        char resultChar=' ';
        for (int i = 0; i < characters.length(); i++) {
            newCharacters = characters.replaceAll(characters.charAt(i) + "", "");

            if (newCharacters.length() < characters.length() - 1) {
                resultChar= characters.charAt(i);
            } else {
                if (i != characters.length() - 1)
                    continue;
                else
                    break;
            }
        }
        return resultChar;
    }
}
