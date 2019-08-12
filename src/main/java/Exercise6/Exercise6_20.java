package Exercise6;

public class Exercise6_20 {
    static int[] shuffle(int[] arr){
        for(int i = 0;i < arr.length;i++) { //arr.length번만큼 반복해야 모든 경우의 수 커버 가능
            int temp = 0;
            int j = arr[(int)(Math.random() * arr.length) - 1];

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String args[]) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

}
