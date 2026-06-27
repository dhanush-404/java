import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist{
    Node head=null;
    void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;   
    }
    void insertAtanypos(int pos,int data){
        Node newNode=new Node(data);
        if(pos==1){
            insertFront(data);
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Invalid position");
                return;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }   

    }
    void deleteEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void deleteFront(){
        if(head==null){
            System.out.println("linked List is empty");
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
            head=head.next;
        }
    }
    void deleteAtanypos(int pos){
        if(head==null){
            System.out.print("Linked list is empty");
            return;
        }
        if(pos==1){
            deleteFront();
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            System.out.println("Invalid Position");
            return;
        }
        temp.next=temp.next.next;

    }
    void search(int data){
        Node temp=head;
        int i=1;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Element is found at "+i);
                break;

            }
            i++;
            temp=temp.next;
            if(temp==null){
                System.out.println("Element is not founded");
            }
        }

    }
    void disp(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print("|"+temp.data+"|->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    void dispreverse(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        Node t=head;
        int c=0,i=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int arr[]=new int[c];
        while(t!=null){
            arr[i]=t.data;
            i++;
            t=t.next;
        }
        for(int j=c-1;j>=0;j--){
            System.out.print("|"+arr[j]+"|->");
        }
        System.out.print("null");

    }
    void sort(){
        Node left=head;
        System.out.println("\nSorted Linkedlist :");
        while(left!=null){
            Node right=left.next;
            while(right!=null){
                if(left.data>right.data){
                    int temp=right.data;
                    right.data=left.data;
                    left.data=temp;
                }
                right=right.next;
            }
            left=left.next;
        }
        disp();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist obj=new linkedlist();
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.insertEnd(40);
        obj.disp();
        obj.insertFront(20);
        obj.disp();
        obj.insertAtanypos(10, 90);
        obj.disp();
        obj.deleteEnd();
        obj.disp();
        obj.deleteFront();
        obj.disp();
        obj.deleteAtanypos(4);
        obj.disp();
        obj.search(20);
        obj.dispreverse();
        obj.sort();
        

    }
}