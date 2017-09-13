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
public class Dolphin extends Mammal implements Iswim, ImakeSound{
public Dolphin(double bodyTemp, String name){
    super(bodyTemp, name);
}
    @Override
    public void Iswim() {
        System.out.println("swim swim");
    }

    @Override
    public void ImakeSound() {
        System.out.println("eeee");
    }
    
}
