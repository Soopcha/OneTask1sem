
/*   ТАСК 1 ВАРИАНТ 1
1.	Реализовать класс для представления чисел в произвольной системе счисления.

Задача, прежде всего на инкапсуляции, но местами уже наследование всплывает.
Для задач, которые не предполагают визуализацию, должен быть написан код,
демонстрирующий работу с классом и показывающий, что ваш код рабочий.
Если в условии задачи что-то непонятно – попросить пояснить преподавателя.

через джинерики  как-то (типо чтобы не было много методов )

*/
public class BasedNumber {
    private String number; //наше число
    private int numberSystem; //система счисления к нему

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumberSystem(int numberSystem) {
        this.numberSystem = numberSystem;
    }

    public int getNumberSystem() {
        return numberSystem;
    }

    public BasedNumber(String number, int numberSystem) {
        this.number = number;
        this.numberSystem = numberSystem;
    }

    public BasedNumber convert(int selectedNumberSystem) {
        int decimalNumber = 0; //десятичное число
        int power = 1;

        //в десятичную
        for (int i = number.length() - 1; i >= 0; i--) {
            int digitValue = Character.isDigit(number.charAt(i)) ? number.charAt(i) - '0' : number.charAt(i) - 'A' + 10;
            decimalNumber += digitValue * power;
            power *= numberSystem;
        }
        //а теперь в ту которая нужна
        StringBuilder targetNumberBuilder = new StringBuilder();
        while (decimalNumber > 0) {
            int digitValue = decimalNumber % selectedNumberSystem;
            char digitChar = digitValue < 10 ? (char) ('0' + digitValue) : (char) ('A' + digitValue - 10);
            targetNumberBuilder.append(digitChar);
            decimalNumber /= selectedNumberSystem;
        }

        if (targetNumberBuilder.length() == 0) {
            targetNumberBuilder.append('0');
        }

        return new BasedNumber(targetNumberBuilder.reverse().toString(), selectedNumberSystem);
    }
}
