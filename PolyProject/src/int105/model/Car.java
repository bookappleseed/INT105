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
public class Car implements Informationable {

    @Override
    public boolean isLife() {
        return false;
    }

    @Override
    public String move() {
        return "move by wheel";
    }

    @Override
    public String giveDetail() {
        return "Vehicle";
    }
    
}
