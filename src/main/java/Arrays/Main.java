package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList(5);
        ArrayList arrayList2=new ArrayList(5);
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(3);
        arrayList.add(41);
        arrayList.add(5);
        arrayList.add(61);
       // arrayList.insertAt(25,25);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
       // arrayList2.insertAt(25,25);

        System.out.println(arrayList.toString());
        System.out.println(arrayList2.toString());
        System.out.println(arrayList2.contains(5));

        System.out.println(arrayList.intersection(arrayList2));

    }

}
