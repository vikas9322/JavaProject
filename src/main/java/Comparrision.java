public class Comparrision {



        public static void main (String[] args) {
            /* code */
            String str1 = "Java Developer";
            String str2 = "java developer";
            Boolean result = str1.equalsIgnoreCase(str2);
            System.out.println(result);

            String message = "Java is fun!";
            System.out.println(message.charAt(11));

            String text = "Hello, Java!";
            String emptyString = "";
            System.out.println(text.isEmpty());
            System.out.println(emptyString.isEmpty());


            String text1 = "Java is fun";
            System.out.println(text.toUpperCase());

            float price = 9.99f;
            String converted = String.valueOf(price);
            System.out.println(converted);

            String text2 = "";

            StringClass str = new StringClass();
            str.hashCode();
        }


}
