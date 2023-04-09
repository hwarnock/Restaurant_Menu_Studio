import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.util.Objects;

public class Menu {

    private Date lastUpdated;
    private ArrayList<Item> menuItemList;

    public Menu(){
        this.lastUpdated = new Date();
        this.menuItemList = new ArrayList<>();
    }

    @Override
    public String toString(){
        String str = ("This Menu was created on " + this.lastUpdated +", and has this arrayList " + this.menuItemList);
        System.out.println(str);
        return str;

    }

    public void printAll() {
        for (Item item : this.getMenuItemList()) {
            System.out.println(item);
        }
    }

//    public void printOne(Item item) {
//
//        System.out.println(menuItemList);
//    }
    public void addMenuItem(Item item){
        menuItemList.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(Item item){
        menuItemList.remove(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void printOne(Item item){
        System.out.println(item.getDescription());
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<Item> getMenuItemList() {
        return menuItemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(lastUpdated, menu.lastUpdated) && Objects.equals(menuItemList, menu.menuItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdated, menuItemList);
    }

    public void setMenuItemList(ArrayList<Item> menuItemList) {
        this.menuItemList = menuItemList;
    }
}
