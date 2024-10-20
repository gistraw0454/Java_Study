package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        //data1 = 20;

        //final 지역변수2
        final int data2 =10;
        //data2 = 20;   //컴파일 오류
        method(10);  //여기서 최초 할당했으니, 그 밑에서 값 바꿀수없음

    }

    static void method(final int parameter){
        //parameter=20;
    }
}
