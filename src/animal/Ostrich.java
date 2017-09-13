/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author emendez
 */
public class Ostrich extends Bird implements ImakeSound, Iwalk  {
public Ostrich (double wingspans,String name ){
super(wingspans, name);
}

    @Override
    public void ImakeSound() {
        System.out.println("woo");
    }

    @Override
    public void Iwalk() {
        System.out.println("walk walk");
    }
    
}
