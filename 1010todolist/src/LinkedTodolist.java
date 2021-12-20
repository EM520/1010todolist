

public class LinkedTodolist  {
    private Node head; // References the first node in the chain
    private Node tail;
    public int size =0;
    boolean notFound = true;
    //private Object UnsupportedOperationException;

    public LinkedTodolist(){
        head = null;           // default constructor without arguments
        tail = null;
    }

    public void add(String item) throws UnsupportedOperationException {
        Node temp = new Node(item,null);
        if (size == 0){
            head = temp;
        }else
            tail.next =temp;
        tail = temp;
        size++;
    }

    public void delete(String item) {
        if(size==0){
            System.out.println("The list is empty nothing to be removed");
        }else if (head.data.equalsIgnoreCase(item)){
            head=head.next;
            size--;
            notFound = false;
        }else {
            Node prev = head;
            Node current =head.next;
            notFound = true;
            while (notFound && current!=null){
                if(current.data.equalsIgnoreCase(item)){
                    prev.next = current.next;
                    size--;
                    notFound=false;
                }else{
                    prev = current;
                    current = current.next;
                }
            }
                if (notFound){
                    //System.out.println("Todolist item is  not found!");
                    throw new UnsupportedOperationException("(Not found!)\n");
                }
            }
        }

    public void clear(){
        head=tail=null;
        size =0;
    }

    public boolean isEmpty(){
        return head == null;
    }

//    public int length(){
//        return  size;
//    }
    public String toString(){
        if (isEmpty()){
            return "\n";
        }
        String output="";
        Node current =head;
        int i =1;
        while (current != null) {
            output = output + i + ":" +current.data + "\n" ;
            i++;
            current = current.next;
        }
        return  output ;
    }

    private class Node{
    private String data;            //data filed
    private Node next;
    private Node (String data){
            this(data, null);    // constructor 1
        }

    private Node (String dataP,Node linkN){
            data = dataP;
            next = linkN;// constructor 2
        }
    private String getData()
        {
            return data;
        } // end getData

    private void setData(String newData)
        {
            data = newData;
        } // end setData

    private Node getNextNode()
        {
            return next;
        } // end getNextNode

    private void setNextNode(Node nextNode)
        {
            next = nextNode;
        } // end setNextNode
        }

}
