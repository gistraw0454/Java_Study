package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("construct 초기화");
        ConstructInit construct1= new ConstructInit(10);
        ConstructInit construct2= new ConstructInit(20);
        System.out.println(construct1.value);
        System.out.println(construct2.value);

        //final field 초기화
        System.out.println("field 초기화");
        FieldInit field1 = new FieldInit();
        FieldInit field2 = new FieldInit();
        FieldInit field3 = new FieldInit();
        FieldInit field4 = new FieldInit();
        System.out.println(field1);
        System.out.println(field2);
        System.out.println(field3);
        System.out.println(field4);
    }
}
