package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // down casting 부모 -> 자식

        Child child = (Child)poly; //x001 poly를 강제로 child로 바꿔 호출 가능
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child)poly).childMethod();
    }
}
