package FindRepetitiveChar;

import java.util.HashMap;

public class HashMapSolution {
    public static void main(String[] args) {
        String characters="ALKDCD";
        System.out.println(findRepetitiveCharWithHashMap(characters));
    }

    private static char findRepetitiveCharWithHashMap(String characters) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i <characters.length() ; i++) {
            if( hashMap.containsKey(characters.charAt(i))){
                return characters.charAt(i);
            }
            hashMap.put(characters.charAt(i),1);
        }
        return ' ';
    }
}
