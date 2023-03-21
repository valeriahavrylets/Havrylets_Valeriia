package HW5;

public class HW5 {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(5);
        System.out.println("Largest integer: " + intList.largest());
        System.out.println("Smallest integer: " + intList.smallest());

        MyList2<String> stringList = new MyList2<String>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        System.out.println("Largest string: " + stringList.largest());
        System.out.println("Smallest string: " + stringList.smallest());
    }
}
