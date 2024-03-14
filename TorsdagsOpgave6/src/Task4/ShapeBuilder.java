package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape shape){
        shapesList.add(shape);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(int i = 0; i < shapesList.size(); i++){
            totalArea += shapesList.get(i).getArea();
        }
        return totalArea;
        }
}
