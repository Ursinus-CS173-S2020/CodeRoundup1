    public void test13GetDoomsdayYear2020() {
        int month = 12;
        int day = 7;
        int year = 1643;
        int expResult = 1;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    } 
