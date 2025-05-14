public class AbstractClas {

    void hello(){
        System.out.println("Hello");
    }

}

//Write an abstract class 'Vehicle' with an abstract method 'start()' and a concrete method 'stop()'.
//Implement a subclass 'Car' that provides the implementation for 'start()'


abstract class Vehicle{
    abstract void start();

    void stop(){
        System.out.println("STOP");
    }
}

class car extends Vehicle {

    @Override
    void start() {

    }
}

//Create an interface 'Animal' with a method 'makeSound()'. Implement this interface in two
//
//       classes: 'Dog' and 'Cat'.


interface a{
    void bi();
    void bi1();
    void bi2();

    default  void b3(){
        System.out.println("pg");
    }
}

abstract class de implements a {

    @Override
    public void b3() {
        a.super.b3();
    }
}