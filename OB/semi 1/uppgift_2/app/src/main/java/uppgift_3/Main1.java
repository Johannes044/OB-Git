package uppgift_3;

public class Main1 {
    public static void main(String[] args) {
        PointFactory f2d = new Point2DFactory();
        PointFactory f3d = new Point3DFactory();

        double d1 = DistanceCalculator.distance(f2d, "3.0,4.0", "0.0,0.0");
        System.out.println("Avstånd 2D: " + d1);  // => 5.0

        double d2 = DistanceCalculator.distance(f3d, "1.0,2.0,3.0", "4.0,6.0,3.0");
        System.out.println("Avstånd 3D: " + d2);  // => 5.0
    }
}
