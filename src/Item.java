import java.util.Objects;

public class Item {

    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public Item(double price, String description, String category, boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String toString(){
        String str = this.description + " : " + this.price;
//        System.out.println(str);
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && isNew == item.isNew && Objects.equals(description, item.description) && Objects.equals(category, item.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }
    public double getPrice() {
        return price;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
    public String getDescription() {
        return description;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }
    public String getCategory() {
        return category;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }
    public boolean getIsNew() {
        return isNew;
    }


}
