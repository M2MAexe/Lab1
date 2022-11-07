import static java.lang.Math.*;
import java.util.*;

public class Main
{   
  public static void main(String[] args) {
      int[] a = new int[13];
      float[] x = new float[10];
      double[][] a1 = new double[13][10];
      final float minValue, maxValue;
      Random r = new Random();
      minValue = -11.0F;
      maxValue = 12.0F;
      for (int i = 0; i < 13; i++)
          a[i] = 5 + i;
      for (int i = 0; i < 10; i++) {
          x[i] = minValue + (maxValue - minValue) * (float) r.nextDouble();
      }
      for (int i = 0; i < 13; i++) {
          if (a[i] == 6)
              for (int j = 0; j < 10; j++)
                  a1[i][j] = pow(pow((3 - asin((x[j] + 0.5) / 23)), pow(2 * x[j], x[j])), (PI * log(sqrt(abs(x[j])))) / pow(pow(x[j] / x[j] + 0.5, 2) - 1, log(abs(x[j]))));
          else if (a[i] <= 16 && a[i] >= 11 || a[i] == 7)
              for (int j = 0; j < 10; j++)
                  a1[i][j] = (pow(cbrt(x[j]), log(abs(x[j])) / 2) - 1) / pow(2 * pow(x[j] - 1 / 3.0f, x[j]), pow(3 / x[j], x[j]));
          else
              for (int j = 0; j < 10; j++)
                  a1[i][j] = pow(pow(3 / 4.0f / (4 * (asin((x[j] + 0.5) / 23) + 1/ 4.0f) - 1), 3) / 2, 2);
      }
      for (int i = 0; i < 13; i++) {
          for (int j = 0; j < 10; j++)
              System.out.printf("%.2f ", a1[i][j]);
          System.out.print("\n");
      }
  }
}