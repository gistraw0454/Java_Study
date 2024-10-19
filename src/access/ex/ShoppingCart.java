package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count=0;

    public void addItem(Item item){
        if (count >=10){
            System.out.println("그만.");
        }
        else{
            items[count] = item;
            count++;
        }
    }

    public void displayItems(){
        for (int i=0; i<count;i++) {
            System.out.println(items[i].getName()+items[i].sum());
        }
        System.out.println(totalSum());
    }

    private int totalSum(){
        int totalsum =0;
        for (int i=0; i<count;i++) {
            totalsum +=items[i].sum();
        }
        return totalsum;
    }

}
