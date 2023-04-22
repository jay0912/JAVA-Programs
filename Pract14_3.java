//P->14, 3.Question.

//Interface Transport
interface Transport {
    void deliver();
}

//Abstract class of animal
abstract class Animal { 
    abstract void display();
}

//Tiger class
class Tiger extends Animal {
    void display() {
        System.out.println("\nTiger Class...");
    }
}

//Camel Class
class Camel extends Animal implements Transport {
    void display() {
        System.out.println("\nCamel Class...");
    }

    public void deliver() { 
        System.out.println("Camel Delivered...");    
    }
}

//Deer Class
class Deer extends Animal {
    void display() {
        System.out.println("\nDeer Class...");
    }
}

//Donkey class
class Donkey extends Animal implements Transport {
    void display() {
        System.out.println("\nDonkey Class...");
    }

    public void deliver() {
        System.out.println("Donkey DEliverd...\n");
    }
}

//Main Class
public class Pract14_3 {
    //Main Method
    public static void main(String[] args) {
        //Object Intailization
        Tiger t = new Tiger();
        t.display();

        Camel c = new Camel();
        c.display();
        c.deliver();

        Deer d = new Deer();
        d.display();

        Donkey don = new Donkey();
        don.display();
        don.deliver();
    }
}
