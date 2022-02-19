public class Class1 {

    static int i1 = 2;
    static int i2 = 4;
    static int i3 = 3;
    static int i4 = 5;

    public static void main(String[] args) {
        int s1 = i1 + i2;
        int s2 = i3 + i4;
        System.out.println(s1 > s2);
        s1++;
        s2 -= 2;
        System.out.println(s1 > s2);
        boolean b = ((s1 % 2) == 0) || ((s2 % 2) == 0);
        System.out.println(b);
        }
}
