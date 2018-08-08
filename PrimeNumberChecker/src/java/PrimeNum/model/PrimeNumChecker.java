/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNum.model;

/**
 *
 * @author Books
 */
public class PrimeNumChecker {
    private int num;
    private int count;
    private String checkPrime;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckPrime() {
        return checkPrime;
    }

    public void setCheckPrime(String checkPrime) {
        this.checkPrime = checkPrime;
    }

    @Override
    public String toString() {
        return String.format("num=%d count=%d Result=%s \n",num,count,checkPrime);
        
        
       
    }
    
    
    
}
