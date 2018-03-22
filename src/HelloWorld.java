public class HelloWorld {
    public static void main(String... args) {
        System.out.println("helo world");
        int pound = 2_2;
        String poundStr = Integer.valueOf(pound).toString();
        if (poundStr != null) {
            System.out.println(poundStr);
        }
        double kg = pound * 0.45359237;
        System.out.println(kg);

    }
}
