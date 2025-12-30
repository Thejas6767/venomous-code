package com.xworkz.animal.external;


import com.xworkz.animal.internal.Cat;
import com.xworkz.animal.internal.Dog;
import com.xworkz.animal.internal.Lion;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();


        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();


        Lion myLion = new Lion();
        myLion.eat();
        myLion.roar();
    }
}
