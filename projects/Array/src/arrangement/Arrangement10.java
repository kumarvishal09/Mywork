package arrangement;

import java.util.Arrays;

public class Arrangement10 {
  public static void main(String[] args) {
    int a[] = {1, 3, 2, 2, 5};
    Arrays.sort(a);
    int p =0;
    int b[] = new int[a.length];
    int q = a.length-1;
    int counter = 0;
    for (int i = 0; i < a.length; i++) {
      if((i+1)%2==0) {
        b[i] = a[q--];
      } else {
        b[i] = a[p++];
      }
    }
    System.out.println(Arrays.toString(b));
  }
}
