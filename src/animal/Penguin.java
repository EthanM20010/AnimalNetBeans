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
public class Penguin extends Bird implements Iwalk, Iswim, ImakeSound {
public Penguin(double wingspans, String name){
super(wingspans,name);
}

    @Override
    public void Iwalk() {
        System.out.println("waddle");
    }

    @Override
    public void Iswim() {
        System.out.println("swim swim");
    }

    @Override
    public void ImakeSound() {
        System.out.println("wak");
    }
    
}
