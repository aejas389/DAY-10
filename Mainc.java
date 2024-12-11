import java.util.*;
public class Mainc 
{
    String name;
    Mainc(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s = new teacher();
        s.teach(this);
    }
    public static void main(String[] args) 
    {
        Mainc o=new Mainc("chotu");
        o.agt();
    }
}
class teacher{
    public void teach(Mainc s) 
{

    s.dis1();   
    }
}
