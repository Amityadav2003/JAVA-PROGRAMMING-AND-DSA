public class OOPs{
    public static void main(String[] args) {
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


