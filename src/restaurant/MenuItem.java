package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private category aCategory;
    private double price;
    private boolean newItem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public category getaCategory() {
        return aCategory;
    }

    public void setaCategory(category aCategory) {
        this.aCategory = aCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public enum category{
        APPETIZER{public String toString() {return "appetizer";}},
        MAINCOURSE{public String toString() {return "main course";}},
        DESERT{public String toString() {return "desert";}}
    };

    public MenuItem(String name, String description,category aCategory,double price,boolean newItem){
        this.setName(name);
        this.setDescription(description);
        this.setaCategory(aCategory);
        this.setPrice(price);
        this.setNewItem(newItem);
    }
}
