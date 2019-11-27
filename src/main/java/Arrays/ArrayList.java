package Arrays;
public class ArrayList {

    private int arrayListSize = 0;
    public Object[] numberArray;  //son halde private olacak.Denemeler için array'i public yaptım

    public ArrayList(int initialSize) {
        if (initialSize > 0) {
            this.numberArray = new Object[initialSize];
        } else {
            throw new IllegalArgumentException();
        }
    }
    public boolean add(Object o) {
        for (int i = 0; i < numberArray.length; i++) {
            if(numberArray[i] == null) {
                numberArray[i] = o;
                break;
            }else
                arrayListSize++;
        }
        return true;
    }

    public Object[] remove(int index) {
        if(indexOf(numberArray[index]) != -1){
            numberArray[index] = null;
            arrayListSize--;
            return numberArray;
        }else
            throw  new IndexOutOfBoundsException();
    }

    public int size(){
        return arrayListSize + 1;
    }

    public int indexOf(Object o) {
        int result = -1;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == o) {
                result = i;
                break;
            }
        }
        return result;
    }

}
