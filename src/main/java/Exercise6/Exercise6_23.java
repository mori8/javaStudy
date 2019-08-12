package Exercise6;

public class Exercise6_23 {
    static int max(int[] arr) {
        if (arr != null) { // 제일 먼저 arr이 null인지 확인해야 함, 다른 조건이랑 같이 확인하면 안됨
            if (arr.length == 0) {
                return -999999;
            }
            int max = 0;
            for (int i : arr) {
                if (i > max) max = i;
            }
            return max;
        }
        return -999999;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{}));
    }
}
