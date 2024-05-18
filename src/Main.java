public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Apple", 0.99, 3));
        cart.addItem(new Item("Banana", 0.59, 5));
        cart.addItem(new Item("Orange", 1.29, 2));

        System.out.println("Cart after adding items:");
        cart.showCart();

        cart.removeItem("Banana");

        System.out.println("\nCart after removing Bananas:");
        cart.showCart();
    }
}
