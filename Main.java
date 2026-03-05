import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Book");
            System.out.println("2 Register Member");
            System.out.println("3 Show Books");
            System.out.println("4 Issue Book");
            System.out.println("5 Return Book");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(bid, title, author));
                    break;

                case 2:
                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    lib.addMember(new Member(mid, name));
                    break;

                case 3:
                    lib.showBooks();
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    int issueBook = sc.nextInt();

                    System.out.print("Member ID: ");
                    int issueMember = sc.nextInt();

                    lib.issueBook(issueBook, issueMember);
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
