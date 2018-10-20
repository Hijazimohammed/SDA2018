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
public class MscTitle implements Title{

    @Override
    public void view(String title) {
        System.out.println("Master degree with title: ".toUpperCase()+
                            title.toUpperCase());
    }
}
