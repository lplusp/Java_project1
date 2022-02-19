public class Class1 {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        String val2 = class2.constructString();
        String result2 = String.format("~~~%s~~~", val2);
        System.out.println(result2);
    }
}
