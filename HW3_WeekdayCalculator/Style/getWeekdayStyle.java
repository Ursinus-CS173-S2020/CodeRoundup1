// This code works fine, but it would be slightly more efficient if something
// was changed about the if statements

    public static int getWeekday(int year, int month, int day) {
        int weekday = 0;
        // TODO: Fill this in
        int yDoomsday = getDoomsdayYear(year);
        boolean isLeap = false;
        // TODO: Add logic here
        if((year%4 == 0) && (year%100!=0))
       {
           isLeap= true;
       }
       else if((year%100 == 0) && (year%400 == 0))
       {
           isLeap= true;
       }
       else if(year%400 == 0)
       {
           isLeap= true;
       }
       else
       {
           isLeap= false;
    }
        
        int mDoomsday= 0;
        if (month ==1 && isLeap==false){
            mDoomsday= 3;
        }
        if (month ==1 && isLeap==true){
            mDoomsday= 4;
        }
        if (month ==2 && isLeap==false){
            mDoomsday= 28;
        }
        if (month ==2 && isLeap==true){
            mDoomsday= 29;
        }
        if (month ==3){
            mDoomsday= 7;
        }
        if (month ==4){
            mDoomsday= 4;
        }
        if (month ==5){
            mDoomsday= 9;
        }
        if (month ==6){
            mDoomsday= 6;
        }
        if (month ==7){
            mDoomsday=11;
        }
        if (month ==8){
            mDoomsday= 8;
        }
        if (month ==9){
            mDoomsday= 5;
        }
        if (month ==10){
            mDoomsday= 10;
        }
        if (month ==11){
            mDoomsday= 7;
        }
        if (month ==12){
            mDoomsday= 12;
        }
        
        int diff = day - mDoomsday;
        weekday= (yDoomsday + diff) % 7;
        if (weekday <= 0){
            weekday = weekday + 7;
        }
        return weekday;
    }
