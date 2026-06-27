class Node{
    int data;
    Node next;
    Node pre;
    Node(int data){
        this.data=data;
        this.pre=null;
        this.next=null;
    }
}
public class doublelinkedlist {
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
        newNode.pre=temp;
        temp.next=newNode;
    }
    void insertFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.pre=newNode;
            head=newNode;
        }
    }
    void insertAtpos(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(pos==1){
            insertFront(data);
        }
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp == null || temp.next==null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.next=temp.next;
        temp.next.pre=newNode;
        temp.next=newNode;
        newNode.pre=temp;
    }
    void dispforward(){
        Node temp=head;
        if(head==null){
            System.out.print("Double Linkedlist is empty");
            return;
        }
        while(temp!=null){
            System.out.print(+temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    void dispreverse(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.pre;
        }
        System.out.print("null\n");
    }
    void deleteEnd(){
        if(head.next==null){
            head=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.pre.next=null;
        temp.pre=null;
    }
    void deleteFront(){
        if(head==null){
            System.out.println("Double Linkedlist is empty");
        }
        else{
            if(head.next==null){
                head=null;
            }
        }
        head=head.next;
        head.pre.next=null;
        head.pre=null;

    }
    void deleteAtanypos(int pos){
        Node temp=head;
        if(pos==1){
            deleteFront();
            return;
        }
        // for(int i=1;i<pos-1 && temp!=null;i++){
        //     temp=temp.next;
        // }
        int i=1;
        while(temp != null && i<pos){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println("Invalid");
            return;
        }
        if(temp.next != null){
            temp.next.pre = temp.pre;
        }
        temp.pre.next = temp.next;
        
        // if(temp==null || temp.next==null){
        //     System.out.println("Invalid postion");
        //     return;
        // }
        // temp.next.next.pre=temp;
        // temp.next=temp.next.next;
    }
    void search(int data){
        Node temp=head;
        int c=1,f=0;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Element is founded at pos "+c);
                f=1;
                return;
            }
            c++;
            temp=temp.next;
        }
        if(f==0){
            System.out.println("Element is not founded ");
        }
    }
    void duplicate(){
        Node temp=head;
        System.out.print("Duplicate Elements : ");
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                System.out.print(temp.data+" ");
                while(temp.next!=null && temp.data==temp.next.data){
                    temp=temp.next;
                }
            }
            temp=temp.next;
        }
        System.out.println();
    }
    void sort(){
        Node left=head;
        System.out.println("Sorted Double Linkedlist :");
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
        dispforward();
    }
    public static void main(String args[]){
        doublelinkedlist obj=new doublelinkedlist();
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(20);
        obj.insertEnd(20);
        obj.insertEnd(20);
        obj.insertEnd(20);
        obj.insertEnd(20);
        obj.insertEnd(20);
        
        obj.insertEnd(30);
        obj.dispforward();
        obj.dispreverse();
        obj.insertFront(10);
        obj.dispforward();
        obj.insertAtpos(8,9);
        obj.dispforward();
        obj.deleteEnd();
        obj.dispforward();
        obj.insertEnd(90);
        obj.dispforward();
        obj.deleteFront();
        obj.dispforward();
        obj.deleteAtanypos(2);
        obj.dispforward();
        obj.search(189);
        obj.search(90);
        obj.dispforward();
        obj.sort();
        obj.duplicate();

    }
}