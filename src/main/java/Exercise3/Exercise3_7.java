package Exercise3;

public class Exercise3_7 {
    public static void main(String[] args){
        int fahrenheit = 100;
        int temp = (int)((5 * (float)(fahrenheit - 32) / 9) * 100); // 이게최선이냐
        float celsius = (float)((temp % 1000 > 4) ? (temp + 1) : temp) / 100;

        System.out.println("Fahrenheit :" + fahrenheit);
        System.out.println("Celsius :" + celsius);

    }
}
