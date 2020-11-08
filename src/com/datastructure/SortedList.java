package com.datastructure;


public class SortedList {
 static  class Link{
        protected int  data;
        protected Link next;          // next link in list
        public Link(int a){
            data=a;
        }
        public void display(){
            System.out.println(data);
        }
    }

    private Link first;            // ref to first item in list
    public SortedList(){         // constructor
        first=null;
    }
    public boolean empty(){            //true if no links
        return first==null;
    }
    public void insert(int key){             // insertion in order
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;
        while (current!=null&&key>current.data){
            previous=current;
            current=current.next;
        }
        if (previous==null)    // at beginning of list
            first=newLink;
        else                                  // not at beginning
            previous.next=newLink;
        newLink.next=current;

    }
    public Link remove(){              //delete or return first link
   Link temp = first;
   first= first.next;
   return temp;
    }
    public void displayList(){
        System.out.println("List (first-->last):");
        Link current =first;
        while (current!=null){
                current.display();
        current=current.next;}

    }

}
