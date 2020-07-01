package zp.day3.box1;

public class PracticeCity {
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Changsha";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("loction: " + bj.latitude + " . " + bj.longitude);

    }
}

class City {

}