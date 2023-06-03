public class PrintBook extends Book{
    private int pages;
    private double weight;
    
    public PrintBook(){
        
    }
    
    public PrintBook(String title, String author, String isbn, int pages, double weight){
        super(title, author, isbn);
        this.pages = pages;
        this.weight = weight;
    }
    
    public int getPages(){
       return pages;
    }
    
    public double getWeight(){
         return weight;
    }
    
    @Override
    public double calcWeight(){
        return weight * 1000;
    }
    
    @Override
    public String getSizeDetails(){
        return String.format("PrintBook: %s, %d pages, Weight: %.0f g", getTitle(), pages, calcWeight());
    }
    
    @Override
    public String getBooksList(){
        return String.format("PrintBook: %s by %s, ISBN: %s, %d pages, Weight: %.0f g", getTitle(), getAuthor(), getIsbn(),pages, calcWeight());
    }
    
    @Override
    public String getBookWeight(){
        return String.format("%s: %.0f g ", getTitle(), calcWeight());
    }
}