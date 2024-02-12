import java.util.ArrayList;

public class Libary {
    // Set the initial State of the libary 
    ArrayList<LibaryItem> items = new ArrayList<>();
    ArrayList<LibaryMember> members = new ArrayList<>();

    //Set the constructor
    public Libary(){

    }

    public void addItem(LibaryItem item){
        items.add(item);
    }
    public void addMember(LibaryMember member){
        members.add(member);
    }

    public String toString(){
        return "Libary{"+ "items=" + items +", members=" + members +'}';
    }
}
