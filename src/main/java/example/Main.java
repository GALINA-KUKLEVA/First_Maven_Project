package example;

public class Main {

    public static String pad(String text, int len, String substr) {

        if (text == null) {
            return null;
        }
        String result = text;
        while (result.length() < len) {
            result +=substr;
        }

        return result;
    }
    public static void main(String[] args) {
                        test();
    }
    public static void test(){
        System.out.println("Sergey!!!!".equals(
                pad("Sergey", 10, "!")
        ));
    }

    public static void nullTest(){
        System.out.println(null == (
                pad(null, 10, "")
        ));
    }
}
