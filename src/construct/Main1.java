package construct;

public class Main1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",10,90);
        MemberConstruct member2 = new MemberConstruct("user2",10,90);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println(member.name+ member.age+ member.grade);

        }
    }
}
