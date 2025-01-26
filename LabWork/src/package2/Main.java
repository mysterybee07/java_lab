package package2;

import package1.ClassA;
import package1.ClassB;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();

        // Access fields from ClassA in Main (Different Package, Non-Subclass)
        System.out.println("From Main (Different Package):");
        System.out.println("Public Field: " + classA.publicField);
//         Private and protected field are not accessible

        // Access ClassB (Same Package as ClassA)
        classB.accessClassAFields();

        // Access ClassC (Different Package, Subclass of ClassA)
        classC.accessClassAFields();
    }
}
