// design linked list singly and doubly 

public class InsertionSingly{
    node head;
    node tail;
    int size;
    public InsertionSingly(){
        this.size=0;
    }

    public void insertatbeg(int value){
        node node1=new node(value);
        node1.next=head;
        head=node1;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertatend(int value){
        node node1=new node(value);
        if(tail==null){
            insertatbeg(value);
            return;
        }
        tail.next=node1;
        tail=node1;
        size+=1;
    }

    public void insertatanypos(int value , int position){
        node node1 = new node(value);
        if(position==0){
            insertatbeg(value);
            return;
        }
        node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        node1.next=temp.next;
        temp.next=node1;
        size++;
    }

    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " ->");
            temp=temp.next;
        }
        System.out.println("end");
    }

    class node{
        int value;
        node next;
        public node(int value){
            this.value=value;
        }
        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        InsertionSingly q1=new InsertionSingly();
        q1.insertatbeg(10);
        q1.insertatbeg(20);
        q1.insertatbeg(30);
        q1.insertatbeg(40);
        q1.insertatend(70);
        q1.insertatanypos(4,3 );
        q1.display();
    }
}