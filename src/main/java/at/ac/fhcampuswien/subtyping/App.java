package at.ac.fhcampuswien.subtyping;

public class App {

    public static void main(String[] args) {
        BaseType1 base1 = new SubType2();
        BaseType1 base2 = new SubType3();
        base1.method1();
        base2.method1();

        BaseTypeA baseA = new SubTypeB();
        BaseTypeA baseB = new SubTypeC();
        baseA.method1();
        baseB.method1();
    }
}
