

package extend1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    //constructor
    public Book(String name, int price, String author, String isbn){
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    //Override print()
    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:"+author+", isbn:"+isbn);
    }
}
