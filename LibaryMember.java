import java.util.ArrayList;
// Information regarding libary members
public class LibaryMember {
    String name; 
    String address;
    String contact;
    int numberId;
    ArrayList<LibaryItem> borrowItems = new ArrayList<>();
    double fines;

    //The construction of libary member
    public LibaryMember(String Name, String Address, String Contact, int NumberId){
        this.name = Name;
        this.address = Address;
        this.contact = Contact;
        this.numberId = NumberId;
    }

    //Checking out a libary item
    public void borrowItem(LibaryItem item){
        borrowItems.add(item);
    }

    //Returning a libary item
    public void returnItem(LibaryItem item){
        borrowItems.remove(item);
    }

    //Out put libary info to terminal
   public String toString(){
    return "Name: " + name + " Address: " + address + " Contact: " + contact + " NumberId: " + numberId;
   }


}
