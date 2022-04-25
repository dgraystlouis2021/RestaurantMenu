package restaurant;

import java.util.ArrayList;
import java.util.Date;
import restaurant.MenuItem.category;

public class RestaurantMenu {

    public static void main(String[] args) {
	// write your code here
        MenuItem hamburger=new MenuItem("Hamburger","Beef patty with bun and fries",category.MAINCOURSE,10.00,true);
        MenuItem cheeseburger=new MenuItem("Cheeseburger","Beef patty topped with cheese with bun and fries", category.MAINCOURSE,11.00,true);
        MenuItem chickenSandwich=new MenuItem("Chicken Sandwich","Grilled chicken with bun and fries", category.MAINCOURSE,10.00,true);
        MenuItem applePie=new MenuItem("Apple Pie","Slice of apple pie", category.DESERT,8.00,true);
        MenuItem cherryPie=new MenuItem("Apple Pie","Slice of apple pie", category.DESERT,8.00,true);
        ArrayList<MenuItem> menuItems=new ArrayList<>();
        //menuItems.addItem(hamburger);
        //menuItems.addItem(cheeseburger);
        //menuItems.addItem(chickenSandwich);
        //menuItems.add(applePie);
        //menuItems.add(cherryPie);
        Menu menu=new Menu(menuItems,new Date());
        menu.addItem(hamburger);
        menu.addItem(hamburger);
        menu.addItem(cheeseburger);
        menu.addItem(chickenSandwich);
        menu.addItem(applePie);
        menu.addItem(cherryPie);
        //menu.removeMenuItem(cheeseburger);

        System.out.println(menu);


        System.out.println(hamburger);
        System.out.println(hamburger.getaCategory());
        System.out.println(hamburger.getPrice());
        System.out.println(menu.getCategories());
    }
}
