public class Book extends LibaryItem{
    //Book Specific Data
    String genre;
    int numberOfPages;

    //Where the book information is constructed
    public Book(String title, String creator,int itemID, String genre, int numberOfPages){
        
        this.title = title;
        this.creator = creator;
        this.itemID = itemID;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    // To String method list Book info
    public String toString(){
        return "Title: " + title + " Author: " + creator +"itemID "+ itemID + " Genre: " + genre + " Number of pages: " + numberOfPages;
    }
}

