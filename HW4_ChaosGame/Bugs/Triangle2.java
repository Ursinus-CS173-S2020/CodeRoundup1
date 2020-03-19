package chaos;
import chaos.StdDraw;
import java.util.Random;

public class Triangle {
    /**
     * Draw the Sierpinski Triangle
     * 
     * @param ax X coordinate of first point
     * @param ay Y coordinate of first point
     * @param bx X coordinate of second point
     * @param by Y coordinate of second point
     * @param cx X coordinate of third point
     * @param cy Y coordinate of third point
     * @param nPoints Number of points to sample
     */
    public static void drawTriangleChaos(double ax, double ay, 
                                         double bx, double by,
                                         double cx, double cy,
                                         int nPoints) {
        // Step 1: Initialize the random number generator
        Random rand = new Random();
        // Step 2: Draw the points on the triangle slightly
        // larger in red
        StdDraw.setPenRadius(0.03);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(ax, ay); // Designate this as the last point drawn
        StdDraw.point(bx, by);
        StdDraw.point(cx, cy);
        // Step 3: Draw the rest of the points smaller in blue
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);
        double px = ax;
        double py = ay;
        StdDraw.point(px, py);
        while (nPoints >= 20000) {
            int nextPoint = rand.nextInt(3); // gives 0, 1, 2
            if (nextPoint == 0) {
                px = (px + ax) / 2;
                py = (py + ay) / 2;
                StdDraw.point(px, py);
            }
            if (nextPoint == 1) {
                px = (px + bx) / 2;
                py = (py + by) / 2;
                StdDraw.point(px, py);
            }
            if (nextPoint == 2) {
                px = (px + cx) / 2;
                py = (py + cy) / 2;
                StdDraw.point(px, py);
            }
            nPoints++;
            StdDraw.pause(1);
        }
        // TODO: Fill the rest in.  You should draw nPoints
        // total, starting with (ax, ay).  Every time, after that,
        // you should pick a random point a, b, or c, and draw
        // the point halfway in between the last point and the 
        // point you chose
    }
    public static void main(String[] args) {
        drawTriangleChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.1, 20000);
    }
}