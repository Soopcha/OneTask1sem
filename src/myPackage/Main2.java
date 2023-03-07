package myPackage;

public class Main2 {
    public static void main(String[] args) {
        BasedNumber2 num1 = new BasedNumber2("9DDDC",16);  // в 16 ричной следует писать строкой
        System.out.println(num1.convert(8).getNumber());
    }
}
