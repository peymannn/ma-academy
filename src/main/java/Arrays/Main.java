package Arrays;
public class Main {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList(5);
        arrayList.add(0);
        arrayList.add(1);
        System.out.println(arrayList.toString());
        System.out.println("\n Size: "+arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        System.out.println("\n Size: " + arrayList.size());
        System.out.println(arrayList.indexOf(5));
    }
}
