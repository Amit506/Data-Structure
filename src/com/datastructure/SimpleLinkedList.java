package com.datastructure;


public class SimpleLinkedList {
   static class  Link{
        protected int data1;      //data item (key)
        protected double data2;   // data item
        protected Link next;        // next link in list
        protected Link(int a,double b)   //constructor
        {
            data1=a;    //initialize data
            data2=b;            // ('next' is automatically set to null
        }
        public void displayLink(){                 //display
            System.out.println("{"+data1+","+data2+"}");
        }
    }



   private Link first;    // refer to first link on list
   public SimpleLinkedList()    //constructor
   {
       first=null;                //no items in list yet(not necessary to initialize null by default it is null)
   }
   public boolean empty(){     // true if list is empty
       return first==null;
   }
   public void insertFirst(int a,double b){  //insert at start of list
       Link newLink = new Link(a,b);     // make new link
       newLink.next=first;                // newLink --> old first
       first=newLink;                    // first --> newLink

   }
   public  Link find( int key){       // find link with given key
       Link current = first;          // assume non-empty list
       while (current.data1!=key){
           if (current.next==null)
               return null;
           else
               current=current.next;    // go to next link
       }
       return current;  // found
   }
   public Link delete(int key){   // delete link with given key
       Link current = first;      // search for link
       Link previous = first;
       while (current.data1!=key){
           if (current.next==null)
               return null;   // didn't find
           else{
               previous=current;    //go to next link
           current=current.next;
       }
       }                                   //if first link
       if (current==first)
           first=first.next;          // change first
       else
           previous.next=current.next;   // bypass
       return current;

   }
   public Link deleteFirst(){
       Link temp= first;
       first = first.next;               // delete it: first-->old next
       return temp;
   }
   public  void displayList(){        // display the list
       System.out.println("List(first-->last): ");
       Link current  =first;           // start at beginning of list
       while (current!=null){          //until end of list
           current.displayLink();        // print data
           current=current.next;          //move to next link
       }
       System.out.println(" ");
   }

}
