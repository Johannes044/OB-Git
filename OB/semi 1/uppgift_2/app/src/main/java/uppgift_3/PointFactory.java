package uppgift_3;

interface PointFactory {
    public Point create(String s);
}

class Point2DFactory implements PointFactory {

    public Point create(String s) {
        String[] parts = s.split(",");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        return new Point2D(x, y);
    }
}

class Point3DFactory implements PointFactory {

    public Point create(String s) {
        String[] parts = s.split(",");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        double z = Double.parseDouble(parts[2]);
        return new Point3D(x,y,z);
    }
}

class DistanceCalculator {
    public static double distance(PointFactory factory, String s1, String s2) {
        Point p1 = factory.create(s1);
        Point p2 = factory.create(s2);
        return p1.distanceTo(p2);
    }
}
