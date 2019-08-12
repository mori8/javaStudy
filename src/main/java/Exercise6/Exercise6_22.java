package Exercise6;

public class Exercise6_22 {
    static boolean isNumber(String str) {
        char ch = ' ';
        boolean flag = true;
        for(int i=0; i < str.length() ;i++){
            ch = str.charAt(i);
            if(ch - 63 > 0 || ch == ' ') {
                flag = false;
                break;
            }
        }
        if (str.equals("")) flag = false;

        return flag;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "은 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "은 숫자입니까? " + isNumber(str));
    }
}
