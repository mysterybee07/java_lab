package package1;

public class ClassA {
    public String publicField = "Public Field";
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";
    String packagePrivateField = "Package-Private Field";

    public void displayFields() {
        System.out.println("From ClassA:");
        System.out.println("Public Field: " + publicField);
        System.out.println("Private Field: " + privateField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Package-Private Field: " + packagePrivateField);
    }
}
