/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.view;

import int105.model.Car;
import int105.model.Dog;
import int105.model.Human;
import int105.model.Informationable;

/**
 *
 * @author INT105
 */
public class TestPoly {

    public static void main(String[] args) {
        Informationable infos[] = new Informationable[5];
        infos[0] = new Car();
        infos[1] = new Dog();
        infos[2] = new Human();
        infos[3] = new Dog();
        infos[4] = new Human();
        int count = 0;
        for (Informationable info : infos) {
            if (info.isLife()) {
                count++;

            }

        }
        System.out.println("Life " + count);
    }

}
