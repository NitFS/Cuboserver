public class Cube implements Shape{

    private double width;
    private double v;

    public Cube (double width){
        this.width = width;
        v = width*width*width;
    }
    @Override
    public double getVolume(){
        return v;
    }

}

