public class Pyramida implements Shape{
    private double baseWidth;

    private double height;

    private double volume;

    public Pyramida(double baseWidth, double height){
        this.baseWidth = baseWidth;
        this.height = height;
        volume = (baseWidth*baseWidth)/3*height;

    }

    @Override
    public double getVolume(){
        return volume;
    }
}