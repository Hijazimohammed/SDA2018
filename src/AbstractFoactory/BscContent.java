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
public class BscContent implements Content{

    @Override
    public void view(String content) {
        System.out.println("Bachelor degree with content: "+
                            content);
    }
}
