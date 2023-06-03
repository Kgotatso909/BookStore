public class PrintBook extends Book{
    private int pages;
    private int weight;
    
    public PrintBook(){
        
    }
    
    public PrintBook(String title, String author, String isbn, int pages, int weight){
        super(title, author, isbn);
        this.pages = pages;
        this.weight = weight;
    }
    
    public int getPages(){
       return pages;
    }
    
    public int getWeight(){
         return weight;
    }
    
    @Override
    public int calcWeight(){
        return weight * 1000;
    }
    
    @Override
    public String getSizeDetails(){
        return String.format("PrintBook: %s, %d pages, Weight: %d g", getTitle(), pages, calcWeight());
    }
}