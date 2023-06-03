public class EBook extends Book{
    private int size;
    
    public EBook(){
        
    }
    
    public EBook(String title, String author, String isbn, int size){
         super(title, author, isbn);
         this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    @Override 
    public double calcWeight(){
        throw new UnsupportedOperationException("EBook does not have Weight");
    }
    
    @Override
    public String getBookWeight(){
        throw new UnsupportedOperationException("EBook does not have Weight");
    }
    
    @Override
    public String getSizeDetails(){
        return String.format("eBook: %s, File Size: %d KB", getTitle(), size);
    }
    
    @Override
    public String getBooksList(){
        return String.format("eBook: %s by %s, ISBN: %s, File Size: %d KB", getTitle(), getAuthor(), getIsbn(),size);
    }
}