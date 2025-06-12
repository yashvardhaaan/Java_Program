class Inheritance {
    void show(){
        System.out.println("This is inheritance");
    }
}
class child extends Inheritance{

}

public class ExampleOfInheritance{
    public static void main(String[] args) {
        child c1 = new child();
        c1.show();
    }
}