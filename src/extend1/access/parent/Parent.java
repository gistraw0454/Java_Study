package extend1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printMethod(){
        System.out.println("==Parent method?==");
        System.out.println("publicValue: "+publicValue);
        System.out.println("protectedValue: "+protectedValue);
        System.out.println("defaultValue: "+defaultValue);
        System.out.println("privateValue: "+privateValue);
    }
}
