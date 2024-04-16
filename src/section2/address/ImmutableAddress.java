package section2.address;

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
