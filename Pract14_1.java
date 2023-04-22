//P->14, 1.question

//abstracr class vegetable
abstract class Vegetable
{
    String color;

    //vegetable constractor
    Vegetable(String color)
    {
        this.color = color;
    }
}

//class Potato
class Potato extends Vegetable
{
    Potato()
    {
        super("Cream");
    }
    public String toString()
    {
        return ("POTATO : "+color);
    }
}

//class Brinjal
class Brinjal extends Vegetable
{
    Brinjal()
    {
        super("Violet");
    }
    public String toString()
    {
        return ("BRINJAL : "+color);
    }
}

//class tomato
class Tomato extends Vegetable
{
    Tomato()
    {
        super("Red");
    }
    public String toString()
    {
        return ("TOMATO : "+color);
    }
}

public class Pract14_1 
{
    public static void main(String[] args) 
    {
        //Object Intailization
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();

        //Display vegetable with their colors 
        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
    }    
}
