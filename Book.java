public class Book {
    private int bookId;
    private String title, author;
    private boolean isIssued;

    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isIssued(){
        return isIssued;
    }

    public void setIssued(){
        isIssued = !isIssued;
    }
}
