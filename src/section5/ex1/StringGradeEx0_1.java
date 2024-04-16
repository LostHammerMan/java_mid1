package section5.ex1;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discountService(StringGrade.BASIC, price);
        int gold = discountService.discountService(StringGrade.GOLD, price);
        int diamond = discountService.discountService(StringGrade.DIAMOND, price);
        int vip = discountService.discountService("VIP", price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("DIAMOND = " + diamond);
    }
}
