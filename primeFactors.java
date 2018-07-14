public class primeFactors {
  public static int[] factor(int numToFactor) {
    int[] factors = new int[0];
    for (int i = 2; i < numToFactor; i++) {
      if (numToFactor % i == 0) {
        factors = append(factors, i);
        numToFactor /= i;
        i--;
      }
    }
    factors = append(factors, numToFactor);
    return factors;
  }

  public static int[] append(int[] arr, int newNum) {
    int[] newArr = new int[arr.length + 1];
    for (int i=0; i<arr.length; i++) {
      newArr[i] = arr[i];
    }
    newArr[newArr.length-1] = newNum;
    return newArr;
  }

  public static void printArr(int[] arr) {
    for (int i = 0; i< arr.length - 1; i++) {
      System.out.print(arr[i] + ", ");
    }
    if (arr.length > 0) {
      System.out.println(arr[arr.length - 1]);
    }
  }

  public static void main(String[] args) {
    int num = 123456789;
    printArr(factor(num));
  }
}