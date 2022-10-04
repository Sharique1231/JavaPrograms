




import java.util.*;


public class Multithreading  implements Runnable
{   
    public void run()
  {
    int i=1;
    while(true)
    {
        System.out.println(i+"world");
        i++;
    }
  }    

public static void main(String[] args) {
    Multithreading t=new Multithreading();
    Thread m=new Thread(t);
    ArrayList<Integer> a=new ArrayList<>();
    m.start();
    int i=1;
    while(true)
    {
        System.out.println(i+"hello");
        i++;
    }
}
}
    

