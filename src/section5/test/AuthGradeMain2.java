package section5.test;

import section5.ex3.Grade;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean isCon = true;


        while (isCon == true){

            System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] :"); input = sc.next();
            System.out.println("input = " + input);

            AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());
            System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다");

            System.out.println("=== 메뉴 목록 ===");

            // valueOf(name) : name 과 일치하는 ENUM 상수 반환
            if (authGrade.getLevel() > 0){
                System.out.println("- 메인 화면");
            }
            if (authGrade.getLevel() > 1) {
                System.out.println("- 이메일 관리 화면");
            }
            if (authGrade.getLevel() > 2) {
                System.out.println("- 관리자 화면");
            }


//            if (input.equals(AuthGrade.GUEST.name())){
//                System.out.println("당신의 등급은 " + AuthGrade.GUEST.getDescription() + "입니다");
//                System.out.println("=== 메뉴 목록 ===");
//                System.out.println("- 메인 화면");
//            } else if (input.equals(AuthGrade.LOGIN.name())) {
//                System.out.println("당신의 등급은 " + AuthGrade.LOGIN.getDescription() + "입니다");
//                System.out.println("=== 메뉴 목록 ===");
//                System.out.println("- 메인 화면");
//                System.out.println("- 이메일 관리 화면");
//            } else if (input.equals(AuthGrade.ADMIN.name())) {
//                System.out.println("당신의 등급은 " + AuthGrade.ADMIN.getDescription() + "입니다");
//                System.out.println("=== 메뉴 목록 ===");
//                System.out.println("- 메인 화면");
//                System.out.println("- 이메일 관리 화면");
//                System.out.println("- 관리자 화면");
//            } else {
//                isCon = false;
//            }
        }
    }
}
