/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author aashgar
 */
public class mvcApp {
    public static void main(String[] args) {
        Model aModel = new Model();
        aModel.setName("Ahmad");
        aModel.setMajor("SW Development");
        aModel.setGrade(89.9);
        View aView = new View();
//        Controller aController = new Controller(aModel, aView);
        //aController.updateView();
        aModel.setName("Maher");
        aModel.setMajor("Phlosophy");
        aModel.setGrade(100);
//        aController.updateView();
        SecondView sv = new SecondView();
                Controller aController = new Controller(aModel, sv);
        aController.updateSview();
    }
    
}
