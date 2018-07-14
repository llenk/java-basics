public class collatzConjecture {
  public static int collatzCalc(int num) {
    if (num == 1) {
      return 0;
    }
    else if (num % 2 == 0) {
      return collatzCalc(num/2) + 1;
    }
    else return collatzCalc(num * 3 + 1) + 1;
  }
  
  public static void main(String[] args) {
    int num = 1223;
    long tot = 0;
    for (int i = 1; i <= num; i++) {
      int steps = collatzCalc(i);
      tot += steps;
    }
    double average = (double)tot/num;
    System.out.println("Average steps up to " + num + ": " + average);
  }
}