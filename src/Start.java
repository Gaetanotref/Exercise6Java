public class Start {
    public static void main(String[] args) {
        //CREATION OF THE OBJECTS
        Shape circle =new Shape(20,"circle");
        Shape square = new Shape(3,43,"square",5);
        Shape rectangle = new Shape(4,22,31,"rectangle",5);
        Shape triangle =new Shape(23,12,44,22,"triangle",31);
        //CREATION OF THE VARIABILES WITH THE OBJECT INSIDE AND PRINT OF THE DETAILS
        //CIRCLE
        String circleDetails= circle.getShapeDetails();
        System.out.println(circleDetails);
        //SQUARE
        String squareDetails= square.getShapeDetails();
        System.out.println(squareDetails);
        //RECTANGLE
        String rectangleDetails= rectangle.getShapeDetails();
        System.out.println(rectangleDetails);
        //TRIANGLE
        String triangleDetails= triangle.getShapeDetails();
        System.out.println(triangleDetails);
    }
}
