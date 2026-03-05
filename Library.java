import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();

    public boolean addBook(Book b) {
        return books.add(b);
    }

    public boolean addMember(Member m) {
        return members.add(m);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.getBookId() + " | " + b.getTitle() + " | " + b.getAuthor());
        }
    }

    public boolean issueBook(int bookId, int memId) {
        Book book = null;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                book = b;
                break;
            }
        }
        if (book == null) {
            System.out.println("Book not found");
            return false;
        }

        if (book.isIssued()) {
            System.out.println("Book is already Issued");
            return false;
        }

        Member member = null;
        for (Member m : members) {
            if (m.getMemId() == memId) {
                member = m;
                break;
            }
        }

        if (member == null) {
            System.out.println("No member with ID:" + memId + " was found");
            return false;
        }

        book.setIssued();

        transactions.add(new Transaction(book.getBookId(), member.getMemId()));
        System.out.println("Book Issued");
        return true;
    }

    public boolean returnBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                if (!b.isIssued())
                    return false;
                else {
                    b.setIssued();
                    System.out.println("Books returned");
                    return true;
                }
            }
        }

        System.out.println("Book Not Found");
        return false;
    }
}
