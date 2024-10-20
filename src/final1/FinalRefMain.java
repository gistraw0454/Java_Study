package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();   //참조형 (참조하는것자체는 변경불가)
        //data = new Data(); final이라 못바꿈

        //참조대상의 값은 변경가능

        data.value =10;
        data.value = 20;

    }
}
