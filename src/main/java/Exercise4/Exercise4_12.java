package Exercise4;

public class Exercise4_12 {
    public static void main(String[] args){
        for(int i = 2;i < 10;i=i+3){
            for(int j = 1;j < 4;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"   ");
                System.out.print((i+1)+"*"+j+"="+((i+1)*j)+"   ");
                System.out.println((i+2)+"*"+j+"="+((i+2)*j));
            }
            System.out.println();
        }

    }
}
