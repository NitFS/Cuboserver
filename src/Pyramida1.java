import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pyramida1 implements Shape{
    private double baseWidth;

    private double height;

    public double getVolume(){
        return (baseWidth*baseWidth)/3*height;
    }
}