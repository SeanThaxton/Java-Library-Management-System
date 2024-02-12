public class LibaryItem {

    //Define the main attributes for Libary Items
    protected String title;
    protected String creator;
    protected int itemID;
    protected boolean available;


    // Define the action that can be take with libary items
    public void checkOutItem(){
        available = false;
    }

    public void returntItem(){
        available = true;
    }

    public boolean checkIfAvailable(){
        return available;
    }
    public int getItemId(){
        return itemID;
    }

    // toString method
    public String toString() {
        return "LibraryItem {" +
           "title='" + title + '\'' +
           ", creator='" + creator + '\'' +
           ", itemID=" + itemID +
           ", available=" + available +
           '}';
    }
}
