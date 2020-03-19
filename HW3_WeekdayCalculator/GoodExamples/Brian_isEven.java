    public static boolean isEven(int T) {
        boolean result = false;
        if (T % 2 == 0) {
            result = true;
            
        }
        return result;
    }
    
    /**
     * Return the doomsday for a particular year.  This should
     * call getCenturyAnchor at some point
     * 
     * @param year The year
     * @return The doomsday for that year as an integer
     *         (where 0 - Sunday, 1 - Monday, ..., 6 - Saturday)
     */
    public static int getDoomsdayYear(int year) {
        
        int doomsday = 0;
        int T = year % 100;
        if (!isEven(T)) {
            T = T + 11;
        }
        else {
            
        }
        T = T/2;
        if (!isEven(T)) {
            T = T + 11;
        }
        T = 7 - T % 7;
        
        // TODO: Fill this in
        // Compute c, then pass it on
        int c = year / 100;
        int anchor = getCenturyAnchor(c);
        doomsday = (T + anchor) % 7;
        
        return doomsday;
    
    }
