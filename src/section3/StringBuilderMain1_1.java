package section3;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");

        System.out.println("sb = " + sb);

        sb.insert(3, " java");
        System.out.println("insert = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder 의 결과를 기반으로 String 을 생성해서 반환
        // StringBuilder 는 가변객체이므로 문자열 변경이 끝나면 불변 객체(String)으로 변환
        // 하는 것이 안전
        String string = sb.toString();
        System.out.println("toString = " + string);

    }
}
