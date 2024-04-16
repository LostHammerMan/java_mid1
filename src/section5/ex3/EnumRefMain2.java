package section5.ex3;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        int basic = discountService.discount(Grade.BASIC, price);
//        int gold = discountService.discount(Grade.GOLD, price);
//        int diamond = discountService.discount(Grade.DIAMOND, price);

        Grade[] grades = Grade.values();

        for (Grade grade : grades){

            printDiscount(grade, price);
        }

    }

    public static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
