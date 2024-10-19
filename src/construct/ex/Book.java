package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this(null,null,0);
    }
    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }



    void displayInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(page);
    }


}
