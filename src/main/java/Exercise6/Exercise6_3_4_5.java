package Exercise6;

public class Exercise6_3_4_5 {
    public static void main(String args[]){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());

        System.out.println(s.info());
    }
}

class Student{
    String name;
    int ban, no, kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return Math.round(getTotal()*10 / 3.0F)/10.0F;
    }

    String info(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}
