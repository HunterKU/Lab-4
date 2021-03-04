/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hunte
 */
public class Bank_ChargesTest {
    
    public Bank_ChargesTest() {
    }

    @Test
    public void testCalculateBankFees1() {
        System.out.println("calculateBankFees");
        int numChecks = 15;
        double expResult = 11.5;
        double result = Bank_Charges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
        
    }
       @Test
    public void testCalculateBankFees2() {
        System.out.println("calculateBankFees");
        int numChecks = 30;
        double expResult = 12.4;
        double result = Bank_Charges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testCalculateBankFees3() {
        System.out.println("calculateBankFees");
        int numChecks = 50;
        double expResult = 13.0;
        double result = Bank_Charges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testCalculateBankFees4() {
        System.out.println("calculateBankFees");
        int numChecks = 100;
        double expResult = 14.0;
        double result = Bank_Charges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }
}
