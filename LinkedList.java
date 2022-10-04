






public class LinkedList
{
    Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static LinkedList insert(LinkedList list,int data)
    {
        Node new_node=new Node(data);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
     static LinkedList insertAt(LinkedList list,int pos,int data)
    {   Node new_node=new Node(data);
        if(pos==0)
        {
              new_node.next=list.head;
              list.head=new_node;
        }
        else
        {
            Node last=list.head;
            for(int i=0;i<pos-1;i++)
            {
                last=last.next;
            }
            new_node.next=last.next;
            last.next=new_node;
        }
        return list;
    }
   static  LinkedList delete(LinkedList list,int pos)
    {
        if(pos==1)
        { 
          //System.out.println("deleted data:"+list.head.data);
          list.head=list.head.next;
        }
        else
        {  Node p=list.head;
            Node q=null;
            for(int i=0;i<pos-1;i++)
            {   q=p;
                p=p.next;
            }
            q.next=p.next;
            p.next=null;
            p=null;
        }
        return list;
    }
    static LinkedList reverseLinkedList(LinkedList list)
    {
        Node p=list.head;
        Node q=null;
        Node r=null;
        while(p!=null)
        {
            r=q;
            q=p;
            p=p.next; 
            q.next=r;
        }
        list.head=q;
        return list;
    }
    static Node reverserecursive(Node head)
      {
        if(head==null||head.next==null)
        return head;
        Node newhead=reverserecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
      }    
      static LinkedList merge(LinkedList list1,LinkedList list2) 
      { LinkedList l1=new LinkedList();
         Node head1=null;
        Node last=null;
        Node p=list1.head;
        Node q=list2.head;
        
        if(p.data<q.data)
        {
            last=p;
            p=p.next;
            head1=last;
            last.next=null;
        }
        else{
            last=q;
            q=q.next;
            head1=last;
            last.next=null;
        }
    
        while(p!=null&&q!=null)
        {
            if(p.data<q.data)
            {
                last.next=p;
                last=p;
                p=p.next;
                last.next=null;
            }
            else{
                last.next=q;
                last=q;
                q=q.next;
                last.next=null;
            }
        }
            if(p!=null)
            last.next=p;
            if(q!=null)
            last.next=q;      
    
        l1.head=head1;
        
        return l1;
      }
        static void print(LinkedList list)
        {
            Node last=list.head;
            while(last!=null)
            {
                System.out.print(last.data+" ");
                last=last.next;
            }
     
        }

    public static void main(String args[]) {
        LinkedList list=new LinkedList();
        LinkedList list2=new LinkedList();
        LinkedList list3=new LinkedList();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        list=insert(list,4);
        list=insert(list,5);
        list=insert(list,6);
        list2=insert(list2,10);
        list2=insert(list2,20);
        list2=insert(list2,30);
        list2=insert(list2,40);
        list2=insert(list2,50);
        list2=insert(list2,60);

        //print(list);
        //list.head=reverserecursive(list.head);
        //print(list);
        list3=merge(list, list2);
        print(list3);
        
    
    }
}

    
