package restaurant;

public class RestaurantMenu {

    public static void main(String[] args) {
	// write your code here
        MenuItem one=new MenuItem("Hamburger","Beef patty with bun and fries", MenuItem.category.MAINCOURSE,10.00,true);
        System.out.println(one.getaCategory());
    }
}
