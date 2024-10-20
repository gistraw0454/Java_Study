package final1.ex;

public class MemberMain {
    public static void main(String[] args){
        Member member = new Member("id","name");
        member.print();
        member.changeData("namename");
        member.print();
    }
}
