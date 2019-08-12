package Exercise4;

public class Exercise4_9 {
    public static void main(String[] args){
        String str = "12345";
        int sum = 0;

        for(int i = 0;i < str.length();++i){
            sum += str.charAt(i) - 48; //아스키 코드로 인식
        }
        System.out.println("sum : " + sum);
    }
}
