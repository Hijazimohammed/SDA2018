/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class StudentMaker {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    Student anArtStudent;
    Student AnEngStudent;
    Student AnItStudent;
    private static StudentMaker studentMaker;
    private StudentMaker(){
        AnItStudent = new ItStudent();
        AnEngStudent = new EngStudent();
        anArtStudent = new ArtStudent();
    }
    public static StudentMaker getStudentMaker(){
        if(studentMaker == null)
            studentMaker = new StudentMaker();
        return studentMaker;
    }
    
    public void viewIt(){
        AnItStudent.view();
    }
    
    public void viewEng(){
        AnEngStudent.view();
    }
     public void viewArt(){
        anArtStudent.view();
    }
    
    
}

    

