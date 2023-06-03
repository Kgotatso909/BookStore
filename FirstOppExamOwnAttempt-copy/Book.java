public abstract class Book implements Bookable{
    private String title;
    private String author;
    private String isbn;
    
    public Book(){
        
    }
    
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public abstract String getSizeDetails();
    
    public abstract int calcWeight();
    
    
}