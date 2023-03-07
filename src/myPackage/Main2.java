package myPackage;

public class Main2 {
    public static void main(String[] args) {
        BasedNumber2 num1 = new BasedNumber2("9DDDC",16);  // в 16 ричной следует писать строкой
        BasedNumber2 num2 = new BasedNumber2(4567,16);
        System.out.println(num1.convert(8).getNumber());
        System.out.println(num2.convert(8).getNumber());
    }
}
