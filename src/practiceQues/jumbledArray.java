package practiceQues;

import java.io.*;
import java.util.*;
public class jumbledArray {
public static Scanner scn=new Scanner(System.in);
static int lilysHomework(int[] arr) {
        Integer[] idxs = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            idxs[i] = i;
        }
        Arrays.sort(idxs, (i1, i2) -> arr[i1] - arr[i2]);
        int swaps1 = countSwaps(idxs);

        Arrays.sort(idxs, (i1, i2) -> arr[i2] - arr[i1]);
        int swaps2 = countSwaps(idxs);

        return swaps1 < swaps2 ? swaps1 : swaps2;
    }

    static int countSwaps(Integer[] idxs) {
        int swaps = 0;
        boolean[] visited = new boolean[idxs.length];

        for (int i = 0; i < idxs.length; i++) {
            if (visited[i]) continue;
            int j = i;
            do {
                visited[j] = true;
                j = idxs[j];
                swaps++;
            } 
            while(j != i);
            swaps--;
        }
        return swaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     
        int n = scanner.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int result = lilysHomework(arr);
        System.out.print(result);
        scanner.close();
    }
}
