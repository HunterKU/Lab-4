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
public class Insurance_EstimatorTest {
    
    public Insurance_EstimatorTest() {
    }

    
    @Test
    public void testInsuranceEstimation() {
        System.out.println("InsuranceEstimation");
        int agecalculation = 33;
        Insurance_Estimator.InsuranceEstimation(agecalculation);
    }
    
}
