package section5.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        printInfo();

    }

    public static void printInfo(){
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades){
            System.out.println("grade = " + grade.name() + ", level=" + grade.getLevel()
                    + ", 설명=" + grade.getDescription());
        }
    }

}
