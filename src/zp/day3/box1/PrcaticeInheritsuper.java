package zp.day3.box1;

public class PrcaticeInheritsuper {
    public static void main(String[] args) {
        Students s = new Student("xiao ming" , 12 , 89);

    }
}
class PrcaticeInheritsuper {
    protected String name;
    protected int age;

    public Practicefiled3(String name , int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Practicefiled3 {
    protected int score;

    public  static(String name, int age , int score) {
        this.score = score;
    }
}