
public class StringImmutable {

    public static void main(String[] args) {

        String s1 = "abc";

        s1.replace('b', 'a');

        System.out.println(s1);    //s1 is still the same

    }
}
