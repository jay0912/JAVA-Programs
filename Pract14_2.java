//p->14, 2.question.

//event listner interface
interface EventListener{
    //performeEvent Method 
    void performEvent();
}

//Mouse Listener interface
interface MouseListener extends EventListener{
    //mouseclicked Method
    void mouseClicked();
    
    //mousePressed Method
    void mousePressed();

    //mouseReleased Method
    void mouseReleased();

    //mouseMoved Method
    void mouseMoved();

    //mouseDragged Method
    void mouseDragged();
}

interface KeyListener extends EventListener{
    //key pressed method
    void keyPressed();

    //keyReleased method
    void keyReleased();
}

//Event class
class Event implements MouseListener, KeyListener {
    
    public void performEvent()
    {
        System.out.println("\nPerforming Event Method...");
    }

    public void mouseClicked()
    {
        System.out.println("Mouse Clicked...");
    }

    public void mousePressed()
    {
        System.out.println("Mouse Pressed...");
    }

    public void mouseReleased()
    {
        System.out.println("Mouse Released...");
    }

    public void mouseMoved()
    {
        System.out.println("Mouse Moved...");
    }

    public void mouseDragged()
    {
        System.out.println("Mouse Dragged...");
    }

    public void keyPressed()
    {
        System.out.println("Key Pressed...");
    }

    public void keyReleased()
    {
        System.out.println("Key Released...\n");
    }
    
}

//Main Class
public class Pract14_2 {
    //Main Method
    public static void main(String[] args) {
        //object Intailization
        Event e = new Event();
        
        //call methods
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
