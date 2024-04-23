package section7;

public class NestedOuterMain {
    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();
        System.out.println(nested.getClass());
    }
}
