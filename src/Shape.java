public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("A shape was created");
        shapeName= "Undefined shape";
    }
    public Shape(double radius,String shapeName){
        System.out.println("A circle was created");
        this.shapeName=shapeName;
    }
    public Shape(int edges,double edgeLength,String shapeName,int numberOfEdges){
        System.out.println("A square was created");
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
    }
    public Shape(int edges,double e1,double e2,String shapeName,int numberOfEdges){
        System.out.println("A rectangle was created");
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
    }
    public Shape(int edges,double e1,double e2,double e3,String shapeName,int numberOfEdges){
        System.out.println("A triangle was created");
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
    }

    public String getShapeDetails(){
        return shapeName+" "+numberOfEdges;
    }
}
