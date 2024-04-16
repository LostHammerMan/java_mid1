package section2.address;

import java.util.Arrays;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");
        ImmutableAddress immutableAddress = new ImmutableAddress("서울");

        MemberV1 memberA = new MemberV1("회원1", immutableAddress);
        MemberV1 memberB = new MemberV1("회원2", immutableAddress);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 B의 주소 변경
//        memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }


}
