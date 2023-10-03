public class Main {
    public static void main(String[] args) {
        System.out.println("Hello,world!");

        Cube cube1 = Cube.builder().width(2.0F).build();
        Pyramida1 pyramida1 = new Pyramida1(2.0F,2.0F);

        System.out.println(cube1.getWidth());
        System.out.println(cube1.getVolume());

        System.out.println(pyramida1.getBaseWidth());
        System.out.println(pyramida1.getHeight());
        System.out.println(pyramida1.getVolume());





    }
}