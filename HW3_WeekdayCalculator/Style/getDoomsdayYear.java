// This code works fine, but it can be made shorter

    public static int getDoomsdayYear(int year) {
        int T = year % 100;
        int Tnew = 0;
        int Tfinal = 0;
        int Tend = 0;
        int anchor = getCenturyAnchor(year);
        int ydoomsday = 0;
        
        if (!(T % 2 == 0)){
            Tnew = (T + 11) / 2;
        }
        else {
            Tnew =  T / 2;
        }
        
        if (!(Tnew % 2 == 0)){
            Tfinal = (Tnew + 11);
        }
        else {
            Tfinal =  Tnew;
        }
       
        
        Tend = 7 - Tfinal % 7;// TODO: Fill this in
        ydoomsday = (Tend + anchor) % 7;
        
        return ydoomsday;
    }
    
