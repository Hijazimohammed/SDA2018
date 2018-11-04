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
public class Controller {
    private Model aModel;
    private View aView;
    private SecondView sview;
    public Controller(Model aModel, SecondView aView){
        this.aModel = aModel;
        this.sview = aView;
    }
    public void updateSview(){
         sview.showView(aModel.getName(), aModel.getMajor(),
                aModel.getGrade());
    }
    public void updateView(){
        aView.showData(aModel.getName(), aModel.getMajor(),
                aModel.getGrade());
    }
    
}
