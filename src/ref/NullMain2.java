package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data = new Data();  //이거 추가하면 잘돌아감
        data.value = 10;    // null.value ?
        System.out.println("data= "+data.value);
    }
}
