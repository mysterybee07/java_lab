package package1;

public class ClassB {
    public void accessClassAFields() {
        ClassA classA = new ClassA();
        System.out.println("From ClassB (Same Package):");
        System.out.println("Public Field: " + classA.publicField);
        // System.out.println("Private Field: " + classA.privateField); // Not accessible
        System.out.println("Protected Field: " + classA.protectedField);
        System.out.println("Package-Private Field: " + classA.packagePrivateField);
    }
}
