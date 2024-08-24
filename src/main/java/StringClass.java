public class StringClass {

    public static void main(String[] args) {
        String s = "vikas".toUpperCase();
        System.out.println(s);
        String s1 = new String("vikas").intern();
        System.out.println(s==s1);
        System.out.println(s.length());

    }

    public void testMethod(){

    }
}
