package Exercise4;

public class Exercise4_14 {
    public static void main(String[] args){
        int answer = (int)(Math.random() * 1000) / 10;
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.\n시도 횟수는 " + count + "번입니다.");
                break;
            }
        }while(true);

    }
}
