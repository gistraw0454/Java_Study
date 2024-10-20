package poly.basic;

public class CastingMain4 {
    //다운캐스팅을 자동으로 하지않는 이유
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();
        
        
        //Child를 생성안했는데 하려고하면 casting불가능
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}
