import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Item sandwich = new Item(14.00, "Sandwich", "Entre", true);
        Item iceCream = new Item( 4.00, "Ice Cream", "Desert", false);
        Item wings = new Item(24.00,"Buffalo Wings", "Appetizer", false);
        Item macaroni = new Item(2.00, "Macaroni", "Entre", true);
//        System.out.println(macaroni.getIsNew());
//        macaroni.setIsNew(false);
//        System.out.println(macaroni.getIsNew());
        Menu theMenu = new Menu();

        theMenu.toString();

        theMenu.addMenuItem(iceCream);
        theMenu.addMenuItem(sandwich);
        theMenu.addMenuItem(wings);
        theMenu.addMenuItem(macaroni);

        theMenu.toString();

        theMenu.removeMenuItem(iceCream);
        theMenu.printOne(iceCream);

        theMenu.toString();

        theMenu.printAll();

//        System.out.println(theMenu.toString());
    }


}