package NivelBasico;

public class Array {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i >= j) {
                    nums[i][j] = 1;
                }
                if (i < j) {
                    nums[i][j] = 0;
                }
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }
    }
}
