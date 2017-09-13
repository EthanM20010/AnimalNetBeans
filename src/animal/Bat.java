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
public class Bat extends Mammal implements Ifly, ImakeSound, Iswim{
public Bat(double bodyTemp,String name){
    super(bodyTemp, name);
}
    @Override
    public void Ifly() {
        System.out.println("fwap fwap fwap");
    }

    @Override
    public void ImakeSound() {
        System.out.println("ee ee ee");
    }

    @Override
    public void Iswim() {
        System.out.println("swim swim");
    }
    
}
