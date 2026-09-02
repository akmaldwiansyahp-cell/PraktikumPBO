package Jobsheet_01;

public class OOP {
    public static void main(String[] args) {
        product product1 = new product("Coffee", 120000.0f);
        product product2 = new product("Sugar", 30000.0f);
        product product3 = new product("Pilk", 67000.0f);

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
        System.out.println(product3.getName() + ": " + product3.total(2));

    }
}

class product{
    private final String itemName;
    private final float price;

    public product(String itemName, float price){
        this.itemName = itemName;
        this.price = price;
    }

    public float total(int quantity){
        return price * quantity;
    }

    public String getName(){
        return itemName;
    }
}