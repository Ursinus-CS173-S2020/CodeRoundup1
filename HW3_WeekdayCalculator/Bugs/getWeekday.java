    //NOTE FROM PROF. TRALIE: This code is very clever, but there is a 
    //subtle bug!  Hint: What happens to mdoomsday for the month of September?
    
    /**
     * Return the weekday for a particular date in the
     * Gregorian calendar
     * 
     * @param year The year of a date
     * @param month The month of the date (between 1 and 12)
     * @param day The day of the date
     * @return The weekday of the specified date
     *         (where 0 - Sunday, 1 - Monday, ..., 6 - Saturday)
     */
    public static int getWeekday(int year, int month, int day) {
        int mdoomsday = month;
        int ydoomsday = getDoomsdayYear(year);
        boolean LeapYear = isALeapYear(year);
        
        if (LeapYear) {
            if (month == 1) {
                mdoomsday = 4;
            }
            else if (month == 2){
                mdoomsday = 29;
            }
        }
        else {
            if (month == 1) {
                mdoomsday = 3;
            }
            else if (month == 2){
                mdoomsday = 28;   
            }
        }
        if (month == 9 || month == 11){
            mdoomsday = month -4;
        }
        if (!(month % 2 == 0)) {
            mdoomsday = month + 4;
        }
        
        int diff = (day - mdoomsday + ydoomsday) % 7;
        
        if (diff < 0){
            diff = diff + 7;
        }
 
        return diff;
    }
    
