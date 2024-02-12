import java.util.Scanner;

class main{

    public static void main(String[] args) {
        Libary theLibary = new Libary();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the libary interface, please give a command from the list of option: \n" + 
        "1: Add item \n"
        + 
        "2: Add member \n"
        + 
        "3: member item checkout \n"
        + 
        "4: member item return \n"
        + 
        "5: Display State \n"
        + 
        "6: Exit \n");
 
        String user = in.nextLine();
        while(user != "6"){ 
            switch (user){
                case "1":
                    //Gets libary item infromation
                    System.out.println("Ok  is the item a book or dvd");
                    String answer = in.nextLine();

                   if(answer == "book"){

                    //Gets Item  information relating to books 
                    System.out.println("Please enter the title: ");
                    String title = in.nextLine();
                    System.out.println("Please enter the author: ");
                    String author = in.nextLine();
                    System.out.println("What is the genre ");
                    String genre = in.nextLine();
                    System.out.println("Please enter the item ID: ");
                    int itemID = in.nextInt();
                    System.out.println("Please enter the number of pages ");
                    int pageNumber = in.nextInt();

                    //Where the book is added
                    Book theBook = new Book(title, author,itemID, genre,  pageNumber);
                    theLibary.addItem(theBook);
                   }
                   else if(answer == "dvd"){
                    // Gets item information relating to DVD
                    System.out.println("Please give me a director ");
                    String director = in.nextLine();
                    System.out.println("Please give me a duration for the film in minutes ");
                    int duration = in.nextInt();
                    System.out.println("Please enter the title: ");
                    String title = in.nextLine();
                    System.out.println("Please enter the creator: ");
                    String creator = in.nextLine();
                    System.out.println("Please enter the item ID: ");
                    int itemID = in.nextInt();

                    //Where the dvd is added
                    DVD theDvd = new DVD(director, duration, title, creator, itemID);
                    theLibary.addItem(theDvd);
                   }
                   else{
                    //Defualt case if user does not choose a correct item.
                    System.out.println("That is not a valid Libary Item. Please try again.");
                   }
                   System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                   user = in.nextLine();
                    break;
                case "2":
                    //Gets information form user.
                    System.out.println("Please give me your full name: ");
                    String fullName = in.nextLine();
                    System.out.println("Please give me your phone number: ");
                    String phone = in.nextLine();
                    System.out.println("Please give me your address: ");
                    String address = in.nextLine();
                    System.out.println("Please give me your ID: ");
                    int ID = in.nextInt();
                
                    //Add Memeber to the libary
                    LibaryMember member = new LibaryMember(fullName, address, phone, ID);
                    theLibary.addMember(member);
                    System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                    user = in.nextLine();
                    break;
                    
                case "3":
                   // NOT OPTIMAL COME BACK AND CORRECT LATTER!!!!!


                   //Check to see if user is a member
                    System.out.println("Are you a member: yes or no.");
                    String userResponce = in.nextLine();
                    
                    if (userResponce == "yes") {
                        //Used to identify users
                        System.out.println("Please enter your name: ");
                        String name = in.nextLine();
                        
                        //Used to find libary item
                        System.out.println("What itme are you looking to check out?");
                        String userRequestedItem = in.nextLine();
                        
                        //Check if we have the item and it's avaliblity.
                        for(LibaryItem item : theLibary.items){
                            
                            if(item.title == userRequestedItem){
                                //Check to see if item is avaliable.
                                if(item.checkIfAvailable()){

                                    System.out.println("Item is avaliable, checking out now.");
                                    for(LibaryMember theMember : theLibary.members){
                                        
                                        //Find the member
                                        if(theMember.name == name){
                                            //Check out the item
                                            theMember.borrowItem(item);
                                            theLibary.items.remove(theLibary.items.indexOf(item));
                                            System.out.println("Item has been checked out.");
                                        }
                                    }
                                }else{
                                    System.out.println("Item is not avaliable, please try again later.");
                                }
                            }
                        }

                    } else{
                        System.out.println("You must be a member to check out item.");
                    }
                    System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                    user = in.nextLine();
                    break;
    
                case "4":
                  //Check to see if user is a member
                  System.out.println("Are you a member: yes or no.");
                  String userResponce2 = in.nextLine();
                  
                  if (userResponce2 == "yes") {
                      //Used to identify users
                      System.out.println("Please enter your name: ");
                      String name = in.nextLine();
                                            
                      //Finds the member in the database.
                      for(LibaryMember theMember2 : theLibary.members){
                        if(theMember2.name == name){
                            //Check to see what item is being returned
                            System.out.println("What item are you returning?");
                            String userReturnedItem = in.nextLine();
                            
                            for(LibaryItem items : theMember2.borrowItems){
                                
                                if(items.title == userReturnedItem){
                                    //Remove item from member's list
                                    theLibary.addItem(items);
                                    theMember2.returnItem(items);
                                    System.out.println("Item has been returned");
                                }
                            }
                           
                        }  
                        else{
                            System.out.println("We can not find you in the database. We need the member who check out the item to return the item." );
                        }
                      }

                  } else{
                      System.out.println("You must be a member to return an item.");
                  } 
                  System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                  user = in.nextLine();               
                    break;
                case "5":
                    theLibary.toString();
                    System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                    user = in.nextLine();
                    break;
                default:
                System.out.println("That is not a valid Input, try again.");
                System.out.println("Choose anothe option: 1,2,3,4,5, or 6");
                user = in.nextLine();
                    break;
            }

        }
        System.out.println("Thank you, goodbye for now.");
        in.close();

    }
}