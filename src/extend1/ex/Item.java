package extend1.ex;

public class Item {
    //field
    private String name;
    private int price;

    //constructor
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    //getPrice()
    public int getPrice(){
        return price;
    }

    //print()
    public void print(){
        System.out.println("이름:"+name+", 가격:"+price);
    }
}
