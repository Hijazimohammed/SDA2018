/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFoactory;

/**
 *
 * @author aashgar
 */
public class PhdDegree implements Degree{

    @Override
    public Title getTitle() {
        return new PhdTitle();
    }

    @Override
    public Content getContent() {
        return new PhdContent();
    }

    @Override
    public Teacher getTeacher() {
        return new PhdTeacher();
    }
    
}
