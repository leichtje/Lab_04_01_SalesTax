public class SalesTax {
    public static void main(String[] args) {
        double SALES_TAX=.05;
        double purchasePrice=650;
        double calculatedTax=0;
        double totalPrice=0;


        calculatedTax=purchasePrice*SALES_TAX;
        totalPrice=purchasePrice+calculatedTax;

        System.out.println("The purchases Sales tax is:"+calculatedTax);
        System.out.println("The total price of the purchase is"+totalPrice);
    }
}
