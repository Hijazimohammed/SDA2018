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
public class DiplomaDegree implements Degree{

    @Override
    public Title getTitle() {
        return new DiplomaTitle();
    }

    @Override
    public Content getContent() {
        return new DiplomaContent();
    }

    @Override
    public Teacher getTeacher() {
        return new DiplomaTeacher();
    }
    
}
