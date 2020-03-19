    public static int getWeekday(int year, int month, int day) {
        int weekday = 0;
        int ydoomsday = getDoomsdayYear(year);
        
        boolean leapyear = isALeapYear(year);
        if (month  == 1 && leapyear){
            weekday = 4;
        }
        else if (month == 1){
            weekday = 3;
        }
        else if (month ==2 && leapyear){
            weekday = 29;
        }
        else if (month == 2){
            weekday = 28;
        }
        else if (month == 3){
            weekday = 7;
        }
        else if (month == 4){
            weekday = 4;
        }
        else if (month == 5){
            weekday = 9;
        }
        else if (month == 6){
            weekday = 6;
        }
        else if (month == 7){
            weekday = 11;
        }
        else if (month == 8){
            weekday = 8;
        }
        else if (month == 9){
            weekday = 5;
        }
        else if (month == 10){
            weekday = 10;
        }
        else if (month == 11){
            weekday = 7;
        }
        else if (month == 12){
            weekday = 12;
        }
        int diff = ((day - weekday + ydoomsday) % 7);
        if (diff < 0){
            diff = diff + 7;
        }
        // TODO: Fill this in
        
        return diff;
    }
