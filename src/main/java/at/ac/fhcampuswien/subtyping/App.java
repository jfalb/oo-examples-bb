package at.ac.fhcampuswien.subtyping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        BaseType1 base1 = new SubType2();
        BaseType1 base2 = new SubType3();
        SubType2 sub2 = new SubType2();
        base1.method1();
        base2.method1();
        sub2.method1();
        base2.method1();
        
        BaseTypeA baseA = new SubTypeB();
        BaseTypeA baseB = new SubTypeC();
        SubTypeB subB = new SubTypeB();
        baseA.method1();
        baseB.method1();
        subB.method1();

    }
}
