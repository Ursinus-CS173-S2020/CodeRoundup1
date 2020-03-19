/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_weekdaycalculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctralie
 */
public class HW3_WeekdayCalculatorTest {
    
    public HW3_WeekdayCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Tests of getCenturyAnchor method, of class HW3_WeekdayCalculator.
     */
    @Test
    public void testGetCenturyAnchor1900() {
        int century = 1900;
        int expResult = 2; // 1900 is a Wednesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCenturyAnchor2000() {
        int century = 2000;
        int expResult = 2; // 2000 is a Tuesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }

    /**
     * Tests of getDoomsdayYear method, of class HW3_WeekdayCalculator.
     */
    @Test
    public void testGetDoomsdayYear2020() {
        int year = 2020;
        int expResult = 6;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDoomsdayYear2140() {
        int year = 2140;
        int expResult = 1;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCenturyAnchor2200() {
        int century = 2200;
        int expResult = 2; // 2000 is a Tuesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCenturyAnchor3000() {
        int century = 3000;
        int expResult = 2; // 2000 is a Tuesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDoomsdayYear2250() {
        int year = 2250;
        int expResult = 4;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDoomsdayYear2560() {
        int year = 2560;
        int expResult = 5;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayPearlHarbor() {
        int year = 1941;
        int month = 12;
        int day = 7;        
        int expResult = 0;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayDueDate() {
        int year = 2020;
        int month = 2;
        int day = 17;        
        int expResult = 1;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayThanksgiving() {
        int year = 2020;
        int month = 11;
        int day = 26;        
        int expResult = 4;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayBirthday() {
        int year = 2020;
        int month = 10;
        int day = 12;        
        int expResult = 1;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekday911() {
        int year = 2020;
        int month = 9;
        int day = 11;        
        int expResult = 5;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayKobeDay() {
        int year = 2020;
        int month = 8;
        int day = 24;        
        int expResult = 1;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekday4thJuly() {
        int year = 2020;
        int month = 7;
        int day = 4;        
        int expResult = 6;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdaySolstice() {
        int year = 2020;
        int month = 6;
        int day = 21;        
        int expResult = 0;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayCinceDeMay0() {
        int year = 2020;
        int month = 5;
        int day = 5;        
        int expResult = 2;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayAprilFools() {
        int year = 2020;
        int month = 4;
        int day = 1;        
        int expResult = 3;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayStPaddys() {
        int year = 2020;
        int month = 3;
        int day = 17;        
        int expResult = 2;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetWeekdayNewYears() {
        int year = 2021;
        int month = 1;
        int day = 1;        
        int expResult = 5;
        int result = HW3_WeekdayCalculator.getWeekday(year, month, day);
        assertEquals(expResult, result);
    }
}
