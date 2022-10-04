







import java.util.*;
public class LinkedList1
 { Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    static LinkedList1 insert(LinkedList1 list,int data)
    {  
        Node new_node=new Node(data);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else{
            Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
    static void print(LinkedList1 list)
    {
        Node last=list.head;
        while(last!=null)
        {
            System.out.println(last.data);
            last=last.next;
        }
    }
    public static void main(String args[]) {
        LinkedList1 list=new LinkedList1();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        list=insert(list,4);
        list=insert(list,5);
        list=insert(list,6);
       print(list);
        
    }
    
}
