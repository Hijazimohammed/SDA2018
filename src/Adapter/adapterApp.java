/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aashgar
 */
public class adapterApp {
    public static void main(String[] args) {
        Grading aGrading= new adapterGrading();
        System.out.println("Student grade is: "+
                aGrading.computeGrade(89.1, 99.2, 77.9));
    }
}
