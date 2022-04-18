package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItemList;
    private Date date;

    public Menu(ArrayList<MenuItem> menuItemList,Date date){
        this.menuItemList=menuItemList;
        this.date=date;
    }
}
