package Exercise4;

public class Exercise4_10 {
    public static void main(String[] args){
        int num = 12345;

        int firNum = num / 10000;
        int secNum = (num % 10000) / 1000;
        int thiNum = ((num % 10000) % 1000) / 100;
        int fourNum = (((num % 10000) % 1000) % 100 / 10);
        int fifNum = (((num % 10000) % 1000) % 100 % 10);

        int sum = firNum + secNum + thiNum + fourNum + fifNum;

        System.out.println("sum : " + sum);
    }
}
