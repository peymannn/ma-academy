public class repetitiveChars {
    public static void main(String[] args) {
        String characters="APLPbCD";
        ArrayCharracter(characters);

    }

    private static void ArrayCharracter(String characters) {
        String newCharacters="";
        for (int i = 0; i <characters.length() ; i++) {
            newCharacters= characters.replaceAll(characters.charAt(i)+"","" );

          if( newCharacters.length()<characters.length()-1)
          {
              System.out.println(characters.charAt(i));
              break;
          }else{
              if(i!=characters.length()-1)
                  continue;
              else
                  System.out.println(" ");
          }
        }
    }
}
