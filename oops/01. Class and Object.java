public class OOPs{
    public static void main(String[] args) {
        Sutdent s=new Sutdent("Amit",21);
        s.funs();
    }
}

class Sutdent{
    String name;
    int age;
    Sutdent(String name,int age){
        this.name=name;
        this.age=age;
    }
    void funs(){
        System.out.println("Name:"+name+" "+"Age:"+age);
       
    }
}
