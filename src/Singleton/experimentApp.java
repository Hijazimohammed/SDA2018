/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aashgar
 */
public class experimentApp {
    public static void main(String[] args) {
        Experiment exp1 = Experiment.getExperiment();
        exp1.setData(100);
        Experiment exp2 = Experiment.getExperiment();
        exp2.setData(333);
        System.out.println("Exp1 data is:"+
                exp1.getData());
        System.out.println("Exp2 data is:"+
                exp2.getData());
        
    }
    
}
