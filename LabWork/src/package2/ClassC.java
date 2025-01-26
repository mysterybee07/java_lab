package package2;

import package1.ClassA;

public class ClassC extends ClassA {
    public void accessClassAFields() {
        ClassA classA = new ClassA();
        System.out.println("From ClassC (Different Package, Non-Subclass):");
        System.out.println("Public Field: " + classA.publicField);
        // System.out.println("Private Field: " + classA.privateField); // Not accessible
        // System.out.println("Protected Field: " + classA.protectedField); // Not accessible directly
        // System.out.println("Package-Private Field: " + classA.packagePrivateField); // Not accessible

        System.out.println("From ClassC (Accessing Protected Field Through Subclass):");
        System.out.println("Protected Field: " + this.protectedField); // Accessible because it's a subclass
    }
}
