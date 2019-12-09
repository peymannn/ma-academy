package Arrays;

import java.util.Arrays;

public class ArrayList {

    private int size = 0;
    private int[] items;

    public ArrayList(int initialSize) {
        if (initialSize > 0)
            this.items = new int[initialSize];
        else
            throw new IllegalArgumentException();
    }
    public void add(int item) {
        increaseSize(size);

        items[size++] = item;
    }

    public void remove(int index) {
        if(index < 0 || index >= size )
            throw new IllegalArgumentException();

        for (int i = index; i < size; i++)
            items[i] = items[i + 1];

        size--;
    }

    public int size(){
        return size;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public int max(){
        int maxItem = items[0];

        for(int i = 1; i < size; i++)
            if(maxItem < items[i])
                maxItem = items[i];

        return maxItem;
    }

    public int[] reverse(){
        int[] reverseList = new int [size];

        int index = 0;
        for(int i = size -1;  i >= 0; i--)
            reverseList[index++] = items[i];

        return reverseList;
    }

    public ArrayList intersect(ArrayList list){
        int counter = 0;
        ArrayList commonArray = new ArrayList(counter+1);

        for(int item: items)
            if(list.contains(item))
                commonArray.add(item);

        return commonArray;
    }

    public boolean contains(int item) {
       if(indexOf(item) != -1)
           return true;

       return false;
    }

    public void insertAt(int item, int index){
        increaseSize(index);
        items[index] = item;
        size = items.length;
    }

    private void increaseSize(int size) {
        if(size >= items.length){
            int[] newArray = new int[size + 1];

            for (int i = 0; i < items.length; i++)
                newArray[i] = items[i];

            items = newArray;
        }
    }

    @Override
    public String toString(){
        int[] array = new int[items.length];
        for (int i = 0; i < items.length; i++)
            array[i] = items[i];
        return Arrays.toString(array);
    }

}
