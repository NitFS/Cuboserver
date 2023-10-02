public class Main {
    public static void main(String[] args) {
        System.out.println("Hello,world!");
        Cube cube1 = new Cube( 0.5);
        System.out.println(cube1.getVolume());
        Pyramida pyramida1 = new Pyramida( 10,2);
        System.out.println(pyramida1.getVolume());
    }
}