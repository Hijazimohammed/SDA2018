/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class ItCourse extends Course{
    
    public ItCourse(Program aProgram) {
        super(aProgram);
    }
    public void viewData(){
        super.aProgram.viewData();
        System.out.println("IT Course");
    }
    
}
