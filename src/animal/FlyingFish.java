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
public class FlyingFish extends Fish  implements Iswim, ImakeSound, Ifly{
public FlyingFish(boolean isSaltWater, String name){
    super(isSaltWater, name);
}
    @Override
    public void Iswim() {
        System.out.println("swim swim");
    }

    @Override
    public void ImakeSound() {
        System.out.println("splash!");
    }

    @Override
    public void Ifly() {
        System.out.println("fwap fwap");
    }
    
}
