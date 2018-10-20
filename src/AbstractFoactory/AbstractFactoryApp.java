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
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Course aCourse = Course.getCourse();
        
        aCourse.setDegree(new BscDegree());
        aCourse.viewInfo("Sofware Design",
                "This course provides student"
                        + "with profssional knowledge ..","Ahmad");
        aCourse.setDegree(new MscDegree());
        aCourse.viewInfo("Sofware Design",
                "This course provides student"
                        + "with profssional knowledge ..","Ali");
        aCourse.setDegree(new DiplomaDegree());
        aCourse.viewInfo("Sofware Design",
                "This course provides student"
                        + "with profssional knowledge ..","haneen");
        aCourse.setDegree(new PhdDegree());
        aCourse.viewInfo("Sofware Design",
                "This course provides student"
                        + "with profssional knowledge ..","esraa");
    }
    
}
