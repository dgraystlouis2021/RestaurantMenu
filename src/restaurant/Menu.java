package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu extends ArrayList<Object> {
    private ArrayList<MenuItem> menuItemList;
    private Date date;

    /*public enum category{
        APPETIZER{public String toString() {return "appetizer";}},
        MAINCOURSE{public String toString() {return "main course";}},
        DESERT{public String toString() {return "desert";}}
    };*/

    public enum category{APPETIZER, MAINCOURSE, DESERT}

    public Menu(ArrayList<MenuItem> menuItemList,Date date){
        this.menuItemList=menuItemList;
        this.date=date;
    }
    // ADD A MENU ITEM TO THE MENU
    public void addMenuItem(MenuItem menuItem){
        this.menuItemList.add(menuItem);
        date=new Date();
    }

    public void removeMenuItem(MenuItem menuItem){
            for(MenuItem item : this.menuItemList){
                if(item.equals(menuItem)){
                    this.menuItemList.remove(menuItem);
                }
            }
            for(int i=0;i<this.menuItemList.size();i++){
                if(this.menuItemList.get(i).equals(menuItem)){

                }
            }
    }

    public Date getDate(){
        return this.date;
    }

    public ArrayList<MenuItem> getCategoryList(ArrayList<MenuItem> list, category aCategory){
        ArrayList<MenuItem> categoryList=new ArrayList<>();
        for(MenuItem menuItem : list){
            if(menuItem.getaCategory().equals(aCategory)){
                categoryList.add(menuItem);
            }
        }
        return categoryList;
    }

    @Override
    public String toString() {
        String str="";
        str="\nRestaurant Menu\n\n";
        for(category c : category.values()){
            str+="\n"+c+"\n\n";
            for(MenuItem item : menuItemList){
                //var v=item.getaCategory();
                //System.out.println(v);
                if(c.toString().equals(item.getaCategory().toString())){
                    //str+=item.getaCategory()+" ";
                    str+=item.getName()+" Description: "+item.getDescription()+" Price: "+item.getPrice()+"\n";
                }
            }
        }
        return str;
    }

    public String getCategories(){
        String str="";
        for(category c : category.values()){
            str+=c+" ";
        }
        return str;
    }

    public void addItem(MenuItem newItem){
        Boolean itemOnMenu=false;
        for(MenuItem item : menuItemList) {
            if (newItem.equals(item)) {
                System.out.println("Item is already on menu.  It is not added to the menu.");
                itemOnMenu = true;
                break;
            }
        }
            if (!itemOnMenu) {
                menuItemList.add(newItem);
            }
    }
}
