        double px = ax;
        double py = ay;
        int ntimes = 0;
        while(ntimes<= nPoints){
            int choice = rand.nextInt(3);
            if (choice==0){
                px = (px + ax)/2;
                py = (py + ay)/2;
                ntimes++;
                StdDraw.point(px, py);
            }
            if (choice==1){
                px = (px+bx)/2;
                py = (py + by)/2;
                ntimes++;
                StdDraw.point(px,py);
            }
            if (choice == 2){
                px = (px + cx)/2;
                py = (py + cy)/2;
                ntimes++;
                StdDraw.point(px,py);
            
            }
            
                        
            
            
        }
