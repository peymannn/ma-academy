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
        items[size] = item;
        size++;
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
        for (int i = 0; i < size; i++) {
            if(maxItem < items[i])
                maxItem = items[i];
        }
        return maxItem;
    }

    public int[] reverse(){
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = items[i];
            items[i] = items[size - 1 - i];
            items[size - 1 - i] = temp;
        }
        return items;
    }

    public ArrayList intersection(ArrayList arr){
        int counter = 0;
        ArrayList newArrayList = new ArrayList(counter+1);
        for (int i = 0; i < items.length; i++)
                if(arr.contains(items[i]))
                    newArrayList.insertAt(items[i], counter++);
        return newArrayList;
    }

    public boolean contains(int item) {
        for (int i = 0; i < items.length; i++)
            if (items[i] == item)
                return true;
        return false;
    }

    public void insertAt(int item, int index){
        increaseSize(index);
        items[index] = item;       
        size = items.length;
    }

    private void increaseSize(int index) {
        if(index >= items.length){
            int[] newArray=new int[ index + 1 ];
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
