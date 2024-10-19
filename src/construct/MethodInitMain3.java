package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("user",15,90);

        MemberInit member2 = new MemberInit("user2",16,80);


        MemberInit[] members = {member1,member2};

        for (MemberInit member : members) {
            System.out.println(member.name + member.age+member.grade);

        }
    }
}
