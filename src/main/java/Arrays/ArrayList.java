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
        if(size == items.length){
            int[] newArray=new int[size * 2];

            for (int i = 0; i < size; i++)
                newArray[i]=items[i];

            items=newArray;
        }
        items[size++]=item;
    }

    public void remove(int index) {
        if(index < 0 || index >= size )
            throw new IllegalArgumentException();

        for (int i = index; i < size ; i++)
            items[i] = items[i + 1];
        size--;
    }

    public int size(){
        return size;
    }

    public int indexOf(int item) {
        for (int i = 0; i < items.length; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
    @Override
    public String toString(){
        int[] array=new int[size];
        for (int i = 0; i < size; i++)
            array[i]=items[i];

        return Arrays.toString(array);
    }

}
