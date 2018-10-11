public class Triangle {
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }
  public double getPerimeter(){
    return Point.distance(v1,v2)+Point.distance(v2,v3)+Point.distance(v3,v1);
  }
  public Point getVertex(int index){
   Point ans;
   if (index == 0){
     ans = new Point(v1.getX(), v1.getY());
   }
   else if (index == 1){
     ans = new Point(v2.getX(), v2.getY());
   }
   else{
     ans = new Point(v3.getX(), v3.getY());
   }
   return ans;
 }
  public void setVertex(int index, Point newP){
    if(index == 0){
      v1 = new Point(newP.getX(),newP.getY());
    }
    else if(index == 1){
      v2 = new Point(newP.getX(),newP.getY());
    }
    else{
      v3 = new Point(newP.getX(),newP.getY());
    }
  }
  public String toString(){
    return "Triangle: A" + v1.toString() + " B" + v2.toString() + " C" + v3.toString();
  }
}
