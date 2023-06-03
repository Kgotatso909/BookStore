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
    public int calcWeight(){
        throw new UnsupportedOperationException("EBook does not have Weight");
    }
    
    @Override
    public String getSizeDetails(){
        return String.format("eBook: %s, File Size: %d KB", getTitle(), size);
    }
}