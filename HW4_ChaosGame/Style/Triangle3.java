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
        StdDraw.point(ax, ay);
        StdDraw.point(bx, by);
        StdDraw.point(cx, cy);
        // Step 3: Draw the rest of the points smaller in blue
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);
        // TODO: Fill the rest in.  You should draw nPoints
        // total, starting with (ax, ay).  Every time, after that,
        // you should pick a random point a, b, or c, and draw
        // the point halfway in between the last point and the 
        // point you chose
        int count = 0;
        double nx,ny;
        nx = ax;
        ny = ay;
        
        while (count<nPoints){
            StdDraw.point(nx, ny);
            
            int choice = rand.nextInt(3);
            
            
            if (choice==0){
                nx = (nx+ax)/2;
                ny = (ny+ay)/2;
                count++;
                 
                
                System.out.println("Here 1");
            }
            else if (choice==1){
                nx = (nx+bx)/2;
                ny = (ny+by)/2;
                count++;
                System.out.println("Here 2");
            }
            else if (choice==2){
                nx = (nx+cx)/2;
                ny = (ny+cy)/2;
                
                count++;
                System.out.println("Here 3");
               
            }     
        }
        
    }
    
    public static void main(String[] args) {
        //drawTriangleChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.1, 20000);
        drawTriangleChaos(0.1, 0.1, 0.5, 0.9, 0.9, 0.1, 20000);
    }
}
