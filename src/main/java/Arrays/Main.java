package Arrays;
public class Main {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList(5);
        arrayList.add(0);
        arrayList.add(1);
        showArray(arrayList.numberArray);
        System.out.println("\n Size: "+arrayList.size());
        arrayList.remove(0);
        showArray(arrayList.numberArray);
        System.out.println("\n Size: " + arrayList.size());
        System.out.println(arrayList.indexOf(5));
    }
    private static void showArray(Object[] numbers) {
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }

}
