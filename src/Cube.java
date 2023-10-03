import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class Cube implements Shape{

     double width;

    public double getVolume(){
        return width*width*width;
    }

}

