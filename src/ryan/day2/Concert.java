package ryan.day2;

public class Concert {
    public Concert() {
    }

    public void join(Person person){
        System.out.printf("one person join the concert, id card: %d\r\n", person.getIdCard());
    }
}
