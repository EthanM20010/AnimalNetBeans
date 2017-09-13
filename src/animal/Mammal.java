package animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emendez
 */
public class Mammal extends MainProject  {

    double bodyTemp;


    public Mammal(double bodyTemp, String name) {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    
    
    
}
