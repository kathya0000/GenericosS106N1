package Generico;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods<Integer> noGenericMethods = new NoGenericMethods<>(1, 2, 3);

        System.out.println(noGenericMethods.getObj1());
        System.out.println(noGenericMethods.getObj2());
        System.out.println(noGenericMethods.getObj3());

        noGenericMethods.setObj1(4);
        noGenericMethods.setObj2(5);
        noGenericMethods.setObj3(6);

        System.out.println(noGenericMethods.getObj1());
        System.out.println(noGenericMethods.getObj2());
        System.out.println(noGenericMethods.getObj3());
    }
}
