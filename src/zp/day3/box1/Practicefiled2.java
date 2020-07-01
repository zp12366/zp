package zp.day3.box1;

public class Practicefiled2 {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("xiao ming");
        ming.setAge(12);
        System.out.println(ming.getName() );
        System.out.println(ming.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public String getName() {
        return  this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
