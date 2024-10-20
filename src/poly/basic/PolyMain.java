package poly.basic;

public class PolyMain {
    public static void main(String[] args){
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("children -> children");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //부모변수가 자식 인스턴스를 참조 (다형적 참조)
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
