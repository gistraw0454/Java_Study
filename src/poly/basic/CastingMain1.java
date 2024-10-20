package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // down casting 부모 -> 자식

        Child child = (Child)poly; //x001 poly를 강제로 child로 바꿔 호출 가능
        child.childMethod();
    }
}
