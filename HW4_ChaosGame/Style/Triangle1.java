
import chaos.StdDraw;
import java.util.Random;


public class Triangle {
    public static void drawTriangleChaos(double ax, double ay, 
                                         double bx, double by,
                                         double cx, double cy,
                                         int nPoints) {

        Random rand = new Random();
        int period;
        double avgX;
        double avgY;
        double lastX = ax;
        double lastY = ay;

        
        StdDraw.setPenRadius(0.03);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(ax, ay);

        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);

        while (nPoints > 0){
            period = rand.nextInt(3);
            if(period == 0){
                avgX = (ax + lastX)/2;
                avgY = (ay +lastY)/2;
                StdDraw.point(avgX,avgY);
                lastX = avgX;
                lastY = avgY;
            }else if(period == 1){
                avgX = (bx + lastX)/2;
                avgY = (by +lastY)/2;
                StdDraw.point(avgX,avgY);
                lastX = avgX;
                lastY = avgY;
            }else if(period == 2){
                avgX = (cx + lastX)/2;
                avgY = (cy +lastY)/2;
                StdDraw.point(avgX,avgY);
                lastX = avgX;
                lastY = avgY;
            }else{
                System.out.println("Triangle");
            }
            nPoints --;
        }
    }
    
    public static void main(String[] args) {
        drawTriangleChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.1, 20000);
    }
}



