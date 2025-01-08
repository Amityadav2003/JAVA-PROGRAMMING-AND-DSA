public class OOPs{
    public static void main(String[] args) {
      Cat c=new Cat();
      c.eat();
      c.run();
      c.sleep();
       
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
class Cat extends Dog{
    void sleep(){
        System.out.println("Sleeping");    
    }
}


