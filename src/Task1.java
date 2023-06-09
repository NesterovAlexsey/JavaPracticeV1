public class Task1 {
  //You are given a large integer represented as an integer array digits,
  // where each digits[i] is the ith digit of the integer.
  // The digits are ordered from most significant to least significant in left-to-right order.
  // The large integer does not contain any leading 0's.
  //
  //Increment the large integer by one and return the resulting array of digits.

  public static void main(String[] args) {
    int[] example = {1, 2, 3, 9};
    int[] check = plusOne(example);
  }

  public static int[] plusOne(int[] digits) {
    //к нам заходит массив digits.
    // Значит мне нужно:
    // 1. + определить длинну массива.
    // 2. + найти последний элемент.
    // 3. проверить, являеться ли этот элемент числом 9
    // 4. прибавить к этому элементу единицу. учесть граничный случай с числом 9
    // 4. Вернуть элемент в конец массива вместь имеющегося

    int numbersOfElement = digits.length;
    int lastElement = digits[(numbersOfElement - 1)];
    for (int i = numbersOfElement - 1; i >= 0; i--) {
      if (digits[i] == 9) {
        digits[i] = 0;
        digits[i - 1] = digits[i - 1] + 1;
      } else {
        digits[i] += 1;
        break;
      }
    }
    for (int elements : digits) {
      System.out.println(elements);
    }

    return digits;
  }
}