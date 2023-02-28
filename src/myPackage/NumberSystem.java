package myPackage;
/*   ТАСК 1 ВАРИАНТ 1
1.	Реализовать класс для представления чисел в произвольной системе счисления.

Задача, прежде всего на инкапсуляции, но местами уже наследование всплывает.
Для задач, которые не предполагают визуализацию, должен быть написан код,
демонстрирующий работу с классом и показывающий, что ваш код рабочий.
Если в условии задачи что-то непонятно – попросить пояснить преподавателя.

через джинерики  как-то (типо чтобы не было много методов )

 */

public class NumberSystem {
    public static void main(String[] args) {
        System.out.println(conventionToAnArbitraryNumberSystem(12345,2));
    }

private static int conventionToAnArbitraryNumberSystem(int number, int numSystem){
    String str = null;
    while (number != 0){
        str = str + (Integer.toString(number % numSystem));
        number = number/numSystem;
    }
    int result = Integer.parseInt(String.valueOf(str));
    return result;
}

}
