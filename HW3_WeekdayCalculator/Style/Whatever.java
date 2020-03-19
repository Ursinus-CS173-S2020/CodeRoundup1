    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // TODO: Fill in some stuff that helps you test
        // the program.  It might be nice to ask the user
        // for a year/month/day as input, and to display
        // the weekday your program calculates
        // int doomsday = getDoomsdayYear(2020);
        int day = 0, month = 0, year = 0; 
         System.out.print("Enter month: ");
            month = in.nextInt();
         System.out.print("Enter day: ");
            day = in.nextInt();
         System.out.print("Enter year: ");
            year = in.nextInt();
         int winner = getWeekday(year, month, day);
         System.out.print(winner);
         String whatever = getName(winner);
         System.out.print("The Day is: " + whatever);
    }
