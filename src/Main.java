public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println("element 4: "+myList.get(3));
        System.out.println("element 1: "+myList.get(1));
        System.out.println("element 2: "+myList.get(2));

        myList.get(-1);

    }
}
