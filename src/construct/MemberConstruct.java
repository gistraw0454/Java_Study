package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자호출");
        this.name = name;
        this.age = age;
        this.grade = grade;;
    }
}
