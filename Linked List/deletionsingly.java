public class deletionsingly {
    node head;
    int value;
    int size;

    public deletionsingly(){
        this.size=0;
    }

    public void insert(int value){
        node node1=new node(value);
        node1.next=head;
        head=node1;
        size++;
    }

    public void deleteatbeg(){
        if(head==null){
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteatend(){
        if(head==null){
            return;
        }
        node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

    public void deleteatanypos(int position){
        if(head==null){
            return;
        }
        if(position==0){
            deleteatbeg();
            return;
        }
        if(position==size-1){
            deleteatend();
            return;
        }
        node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class node{
        int value;
        node next;
        node(int value){
            this.value=value;
        }
        node(int value , node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        deletionsingly dl=new deletionsingly();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);
        dl.insert(60);
        dl.insert(70);
        dl.deleteatbeg();
        dl.deleteatend();
        dl.deleteatanypos(3);
        dl.display();
    }
}
