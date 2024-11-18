package org.example.assignment3;

//Akshay Vilas Patil
public class LoopComparison {

  public static void main(String[] args) {
    int n = 1;
    while (true) {
      // Measure execution time for Loop A
      long startA = System.nanoTime();
      loopA(n);
      long endA = System.nanoTime();
      double timeA = (endA - startA) / 1e6; // Convert nanoseconds to milliseconds

      // Measure execution time for Loop B
      long startB = System.nanoTime();
      loopB(n);
      long endB = System.nanoTime();
      double timeB = (endB - startB) / 1e6; // Convert nanoseconds to milliseconds

      // Print execution times
      System.out.printf("n = %d, Time A: %.3f ms, Time B: %.3f ms%n", n, timeA, timeB);

      // Check if Loop B is faster
      if (timeB > timeA) {
        System.out.printf("Loop B became faster than Loop A at n = %d%n", n);
        break;
      }
      n++;
    }
  }

  private static void loopA(int n) {
    long sum = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 10000; j++) {
        sum += j;
      }
    }
  }

  private static void loopB(int n) {
    long sum = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        sum += j;
      }
    }
  }
}
