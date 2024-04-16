package section5.ex3;

public class DiscountService {

    /*public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }*/
    public int discount(Grade grade, int price){
        return grade.discount(price);
    }

}
