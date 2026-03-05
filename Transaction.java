import java.util.Date;

public class Transaction {
    int bookId;
    int memId;
    Date issueDate;

    public Transaction(int bookId, int memId) {
        this.bookId = bookId;
        this.memId = memId;
        this.issueDate = new Date();
    }
}
