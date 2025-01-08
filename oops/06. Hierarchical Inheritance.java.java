public class OOPs{
    public static void main(String[] args) {
      Cat c=new Cat();
      c.eat();
      c.sleep();
     Dog d=new Dog();
      d.eat();
      d.run();
       
    }
}

class Animals{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animals{
    void run(){
        System.out.println("Running");    
    }
}
class Cat extends Animals{
    void sleep(){
        System.out.println("Sleeping");    
    }
}


