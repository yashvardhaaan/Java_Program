class shape{
    public void Area(){
        System.out.println("Display area");
    }
}

class triangle extends shape{
    public void CalculateArea(double length,double breadth){
        double result = 0.5*length*breadth;
        System.out.println(result);
    }
}

public class shapeExample {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.Area();
        t1.CalculateArea(10, 20);
    }
}
