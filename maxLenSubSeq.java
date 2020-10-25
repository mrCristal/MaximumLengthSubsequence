public class maxLenSubSeq {
  public static void getLength(int A[]) {
    int N = A.length;
    int L[] = new int[N];

    for (int i = 0; i < N; i++) {
      L[i] = 1;
    }

    for (int i = 1; i < N; i++) {
      for (int j = 0; j < i; j++) {
        if (A[i] > A[j] && L[i] < L[j] + 1) {
          L[i] = L[j] + 1;
        }
      }
    }

    int max = 0;
    for (int count = 0; count < N ; count++) {
      if (max < L[count]) {
        max = L[count];
      }
    }

    for(int i = 0; i< L.length; i++)
    {
      System.out.print(L[i] + ",");
    }

    System.out.println("\nFinal result: " + max);
  }

  public static void main(String[] args) {
    int A[] = {56,-12,4,34,-3,5,35};
    getLength(A);
  }
}