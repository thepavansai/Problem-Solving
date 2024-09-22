class Solution {
    int transform(String A, String B) {
        if (A.length() != B.length()) return -1;

        int[] countA = new int[256];
        int[] countB = new int[256];

        for (char ch : A.toCharArray()) countA[ch]++;
        for (char ch : B.toCharArray()) countB[ch]++;

        for (int i = 0; i < 256; i++) {
            if (countA[i] != countB[i]) return -1;
        }

        int count = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;

        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                j--;
            } else {
                count++;
            }
            i--;
        }

        return count;
    }
}
