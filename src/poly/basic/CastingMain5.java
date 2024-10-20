package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("2 호출");
        call(parent2);
    }

    static void call(Parent p) {
        p.parentMethod();
        if (p instanceof Child){
            System.out.println("Child instance 맞음");
            Child child = (Child)p;
            child.childMethod();
        }
    }
}
