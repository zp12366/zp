package ryan.day2;

public class Student extends Person {
    private String school;

    public Student(PersonEyes eyes, Leg leg, Heart heart, String school, Sequence sequence) {
        super(eyes, leg, heart, sequence);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void working(){
        System.out.println("I don't need work.");
    }
}
