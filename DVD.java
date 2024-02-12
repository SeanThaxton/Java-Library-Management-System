public class DVD extends LibaryItem {
    //DVD Specific DATA
    String director;
    int duration;

    //Where the DVD information is constructed
    public DVD(String Director , int Duration , String Title, String Creator, int ItemID){
        this.director = Director;
        this.duration = Duration;
        this.title = Title;
        this.creator = Creator;
        this.itemID = ItemID;
    }

    // To String method list DVD info
    public String toString(){
        return  "Title: " + title + " Creator: " + creator + " ItemID: " + itemID + " Director: " + director + " Duration: " + duration;
    }
}
