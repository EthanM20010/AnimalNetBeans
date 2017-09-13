/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.ArrayList;

/**
 *
 * @author emendez
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Bird Izzy = new Bird(6.6, "Ostrich");
   Bird John = new Bird(7.5, "Eagle");
   Bird Parker = new Bird(4.0, "Pengiun");
   Mammal Lilly = new Mammal(100.5,"Lion");
   Mammal Tim = new Mammal(98.6,"Dolphin" );
   Mammal Tommy = new Mammal(111.2,"Bat" );
   Fish Mark = new Fish(true, "Shark");
   Fish WallE = new Fish(false, "Bass");
   Fish Danny = new Fish(true, "Flying Fish");
   
    
        
    ArrayList Walkers = new ArrayList<>();
       Walkers.add(Izzy.name);
       Walkers.add(Lilly.name);
       Walkers.add(Parker.name);
       
       
    
    ArrayList Flyers = new ArrayList<>();
       Flyers.add(John.name);
       Flyers.add(Tommy.name);
       Flyers.add(Danny.name);
      
    
    ArrayList Swimmers = new ArrayList<>();
      Swimmers.add(Tim.name);
      Swimmers.add(WallE.name);
      Swimmers.add(Danny.name);
      Swimmers.add(Tommy.name);
      Swimmers.add(Lilly.name);
      Swimmers.add(Parker.name);
      Swimmers.add(John.name);
      
      
    ArrayList SoundMakers = new ArrayList<>();
      SoundMakers.add(Izzy.name);
      SoundMakers.add(John.name);
      SoundMakers.add(Parker.name);
      SoundMakers.add(Lilly.name);
      SoundMakers.add(Tim.name);
      SoundMakers.add(Tommy.name);
      SoundMakers.add(Mark.name);
      SoundMakers.add(WallE.name);
      SoundMakers.add(Danny.name);
    
    
    ArrayList Fishes = new ArrayList<>();
      Fishes.add(Mark.name);
      Fishes.add(WallE.name);
      Fishes.add(Danny.name);
    
    
    ArrayList Birds = new ArrayList<>();
      Birds.add(John.name);
      Birds.add(Izzy.name);
      Birds.add(Parker.name);
    
    
    ArrayList Animals = new ArrayList<>();
      Animals.add(Izzy.name);
      Animals.add(John.name);
      Animals.add(Parker.name);
      Animals.add(Lilly.name);
      Animals.add(Tim.name);
      Animals.add(Tommy.name);
      Animals.add(Mark.name);
      Animals.add(WallE.name);
      Animals.add(Danny.name);
    
    
    ArrayList Mammals = new ArrayList<>();
      Mammals.add(Lilly.name);
      Mammals.add(Tim.name);
      Mammals.add(Tommy.name);
      
      System.out.println("These are the animals "+ Animals);
      System.out.println("Mammals "+ Mammals);
      System.out.println("Birds "+ Birds);
      System.out.println("Fish "+ Fishes);
      System.out.println("Animals that make sounds "+ SoundMakers);
      System.out.println("Animals that can swim "+ Swimmers); 
      System.out.println("Animals that can fly "+ Flyers);
      System.out.println("Animals that can walk "+ Walkers);
    }

    
}
