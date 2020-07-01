package zp.day3.box1;

public class PracticePerson {
    public static void main(String[] args) {
        Person ming = new Person("小米" , 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public  String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}