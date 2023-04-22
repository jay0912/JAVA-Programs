//P->14, 4.Question

//Book Class
class Book {
    private String authorName;

    Book(String a) {
        authorName = a;
    }

    void display() {
        System.out.println("Author : "+authorName);
    }
}

//Class BookPublication
class BookPublication extends Book {
    private String title;

    BookPublication(String a, String t) {
        super(a);
        title = t;
    }
    void display() {
        System.out.println("Book Title : "+title);
    }
}

//Class PaperPublication
class PaperPublication extends Book {
    private String title;

    PaperPublication(String a, String t) {
        super(a);
        title = t;
    }
    void display() {
        System.out.println("Paper Title : "+title);
    }
}

public class Pract14_4 {
    public static void main(String[] args) {
        Book b = new Book(args[0]);
        BookPublication bp = new BookPublication(args[0], args[1]);
        PaperPublication pp = new PaperPublication(args[0], args[2]);

        Book bs = b;
        bs.display();
        bs = bp;
        bs.display();
        bs = pp;
        bs.display();

    }
}
