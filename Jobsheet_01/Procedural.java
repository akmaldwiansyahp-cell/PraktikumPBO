package Jobsheet_01;

public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        float proce1 = 120000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float proce2 = 30000.0f;
        int quantity2 = 1;

        String itemName3 = "Fries";
        float proce3 = 50000.0f;
        int quantity3 = 67;
        
        System.out.println(itemName1 + ": " + total(proce1, quantity1));
        System.out.println(itemName2 + ": " + total(proce2, quantity2));
        System.out.println(itemName3 + ": " + total(proce3, quantity3));
    }

    static float total(float price, int quantity){
        return price * quantity;
    }
}
