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
public class Eagle extends Bird implements Ifly, ImakeSound, Iwalk{
public Eagle(double wingspans, String name){
    super(wingspans, name);
}
    @Override
    public void Ifly() {
        System.out.println("fwap fwap");
    }

    @Override
    public void ImakeSound() {
        throw new UnsupportedOperationException("screech"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Iwalk() {
        System.out.println("click click");
    }
    
}
