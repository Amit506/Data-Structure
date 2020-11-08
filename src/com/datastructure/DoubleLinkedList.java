package com.datastructure;

public class DoubleLinkedList{
    static  class DLink{
        protected int data;     // data item
        protected DLink next;// next link to list
        protected DLink previous;
        public DLink(int a){     //constructor
            data = a;
        }
        public void displayDLink(){
            System.out.println(data+" ");
        }
    }

    private DLink first;                  //ref to first link
   private DLink last;                    //ref to last link
   public DoubleLinkedList(){
       first= null;
       last=null;
   }
   public boolean empty(){              //true if no links
       return first==null;
   }
   public void insertFirst(int a){       //insert at front of list
       DLink newDLink = new DLink(a);     // make new link
       if (empty())
       last= newDLink;
       else
           first.previous=newDLink;   // newLink <-- ild first
       newDLink.next=first;        // newLink -->old first
       first=newDLink;              //first -->newLink
   }
   public void insertLast(int a){
       DLink newDLink = new DLink(a);
       if (empty()){
           first= newDLink;
       }
       else {
           last.next = newDLink;
           newDLink.previous = last;
       }
       last=newDLink;
   }
    public DLink deleteFirst(){
        DLink temp = first;
        if (first.next==null)
            last=null;
        else
           first.next.previous=null;
        first=first.next;
        return temp;
    }
    public DLink deleteLast(){
       DLink temp = last;
       if (first.next==null)
           first=null;
       else
           last.previous.next=null;
       last=last.previous;
       return temp;
    }
    public boolean insertAfter(int key,int a){
       DLink current = first;
       while (current.data!=key){
           current=current.next;
           if (current==null)
               return false;
       }
       DLink newLink = new DLink(a);
       if (current==last){
           newLink.next=null;
           last=newLink;
       }
       else {
           newLink.next=current.next;
           current.next.previous=newLink;
       }
       newLink.previous=current;
       current.next=newLink;
       return true;
    }

   public  void displayDForward(){
       System.out.println("List(first-->last): ");
       DLink current = first;
       while (current!=null){
           current.displayDLink();
           current=current.next;
       }
   }
   public void displayDBackward(){
       System.out.print("List (last-->first): ");
       DLink current = last;
       while (current!=null){
           current.displayDLink();
           current=current.previous;
       }
   }
   public DLink deleteKey(int key){
       DLink current = first;
       while (current.data!=key){
           current=current.next;
           if (current==null)
               return null;
       }
       if (current==first)
           first=current.next;
       else
           current.previous.next=current.next;
       if (current==last)
           last=current.previous;
       else
           current.next.previous=current.previous;
       return current;
   }
}