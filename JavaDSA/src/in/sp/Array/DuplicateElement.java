package in.sp.Array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] num = {10, 15, 13,15, 14, 28, 47, 24, 12, 9, 9};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break;
                }
            }

        }
    }

}

