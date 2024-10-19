package access.ex;

public class Item {
    private String name;
    private int price;
    private int count;

    Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName(){
        return name;
    }

    public int sum(){
        return count* price;
    }
}
