package zp.day3.box1;

public class PracticeCity {
    public static void main(String[] args) {
        City bj = new City();
        bj.setName("Changsha");
        bj.setLatitude(39.903);
        bj.setLongitude(116.401);
        System.out.println(bj.getName());
        System.out.println("loction: " + bj.getLatitude() + " . " + bj.getLongitude());

    }
}
