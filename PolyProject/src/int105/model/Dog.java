/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author INT105
 */
public class Dog implements Informationable {

    @Override
    public boolean isLife() {
            return  true;
    }

    @Override
    public String move() {
        return  "move by leg";
    }

    @Override
    public String giveDetail() {
        return "animal"; 
    }
    
}
