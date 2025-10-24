package Inheritance.PracticeChallenge1;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getItemID(){
        return itemID;
    }

    public void setItemID(String itemID){
        this.itemID = itemID;
    }


    public void checkOut(){
        System.out.println("Checkout is done.");
    }

    public void returnItem(){
        System.out.println("Return the item.");
    }
}
