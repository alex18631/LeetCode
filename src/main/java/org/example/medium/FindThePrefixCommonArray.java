package org.example.medium;

public class FindThePrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        int concurrenceCount = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i != j) {
                    if (A[j] == B[i]) {
                        concurrenceCount++;
                    }
                } else {
                    for (int k = 0; k <= i; k++) {
                        if (A[j] == B[k]) {
                            concurrenceCount++;
                        }
                    }
                }
            }
            result[i] = concurrenceCount;
        }
        return result;
    }
}