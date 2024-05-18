public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Jacket", 50.0, 3));
        cart.addItem(new Item("Shirt", 0.59, 5));
        cart.addItem(new Item("Orange", 1.29, 2));

        System.out.println("Cart after adding items:");
        cart.showCart();

        cart.removeItem("Shirt");

        System.out.println("\nCart after removing Shirt:");
        cart.showCart();
    }
}
