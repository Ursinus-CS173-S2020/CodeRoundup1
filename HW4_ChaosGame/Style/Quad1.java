
        fx = ax;
        fy = ay;
        vx = bx;
        vy = by;
        drawx = (fx+vx)/2;
        drawy = (fy+vy)/2; 
        StdDraw.point(drawx, drawy);
       
        for (int i = 0; i <= nPoints; i++) {
             int f = rand.nextInt(4);
             if (lastF == f) {
                 i--;
             }
             else {
                if (f ==0 ) {
                     fx=ax;
                     fy=ay;
                 }
                if (f ==1) {
                     fx=bx;
                     fy=by;
                 }
                if (f ==2) {
                     fx=cx;
                     fy=cy;
                 }
                if  (f == 3) {
                     fx=dx;
                     fy=dy;
                 }

                 drawx = (fx+vx)/2;
                 drawy = (fy+vy)/2;
                 StdDraw.point(drawx, drawy);

                 vx = drawx;
                 vy = drawy;
                 lastF = f;
             }
        }

