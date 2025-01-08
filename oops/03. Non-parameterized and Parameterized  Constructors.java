public class OOPs{
    public static void main(String[] args) {
        Sutdent s=new Sutdent();
        Sutdent s1=new Sutdent("Amit",21);
       
    }
}

class Sutdent{
    String name;
    int age;
    Sutdent(){
        System.out.println("Non-parameterized Constructors");
    }
    Sutdent(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized Constructors");
    }
    
}
