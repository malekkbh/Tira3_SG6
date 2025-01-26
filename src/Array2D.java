public class Array2D {
    public static void main(String[] args) {
        int[][] school = new int[10][];

        int sum = 0;
        int count = 0;

        for (int i = 0; i < school.length; i++) {
            count += school[i].length;
            for (int j = 0; j < school[i].length; j++) {
                sum += school[i][j];
            }
        }

        for (int i = 0; i < school.length; i++) {
            int[] c = school[i];
            count += c.length;
            for (int j = 0; j < c.length; j++) {
                sum += c[j];
            }
        }

        int avg = sum / (school.length * school[0].length);
        int avg2 = sum / count;

        System.out.println(avg);

    }
}
