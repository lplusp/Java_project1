public class Class2 {
    int i = 123456;

    public String constructString() {
        int val = i;
        String result = String.format("---%d---", val);
        System.out.println(result);
        return String.valueOf(val);
    }
}
