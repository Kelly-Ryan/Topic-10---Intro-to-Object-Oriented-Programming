public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Small", "Ham and Pineapple", 12.00, 10.00);
        Pizza pizza2 = new Pizza("Medium", "Chicken and Mushrooom", 41.00, 12.00);
        Pizza pizza3 = new Pizza("Large", "Tuna and Sweetcorn", 16.00, 14.00);

        System.out.println(pizza1.toString());
        System.out.println(pizza1.eat());
        System.out.println();

        System.out.println(pizza2.toString());
        System.out.println(pizza2.eat());
        System.out.println();

        System.out.println(pizza3.toString());
        System.out.println(pizza3.eat());
        System.out.println();

    }
}