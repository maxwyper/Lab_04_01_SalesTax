public class Main {
    public static void main(String[] args) {

        double purchasingPrice = 110.00;
        double salesTax = purchasingPrice * 0.05;

        System.out.println("The price of the purchase is: $" + String.format("%.2f", purchasingPrice));
        System.out.println("the sales tax at 5% is: $" + String.format("%.2f", salesTax));

    }
}