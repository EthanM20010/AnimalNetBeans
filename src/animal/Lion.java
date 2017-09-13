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
public class Lion extends Mammal implements Iwalk, ImakeSound, Iswim{
public Lion(double bodyTemp, String name){
    super(bodyTemp, name);
}
    @Override
    public void Iwalk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ImakeSound() {
        System.out.println("roar");
    }

    @Override
    public void Iswim() {
        System.out.println("swim swim");
    }
    
}
