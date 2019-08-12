package Exercise5;//5_1 : d, e 배열을 선언할 때 크기를 정할 수 없음
//5_2 : 2

public class Exercise5_3 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
