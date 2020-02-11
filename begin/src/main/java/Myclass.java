public class Myclass<Type> {
    private int numberOfElements;
    private DoublyLinkListNode head;
    public Myclass(){
        head=new DoublyLinkListNode();
        numberOfElements=0;
    }
    public void insertNodeatEnd(Type valueToInsert){
        DoublyLinkListNode <Type> node=new DoublyLinkListNode(valueToInsert);
        if(numberOfElements==0){
            head.setNext(node);
            head.setPrevious(node);
            node.setNext(head);
            node.setPrevious(head);
        }
        else{
            DoublyLinkListNode current=head;
            while(current.getNext()!=head){
                current=current.getNext();
            }
            current.setNext(node);
            node.setPrevious(current);
            node.setNext(head);
            head.setPrevious(node);
        }
        numberOfElements++;
    }
    public void insertNodeatBeginning(Type valueToInsert){
        DoublyLinkListNode <Type> node=new DoublyLinkListNode(valueToInsert);
        if(numberOfElements==0){
            head.setNext(node);
            head.setPrevious(node);
            node.setNext(head);
            node.setPrevious(head);
        }
        else{
            node.setNext(head.getNext());
            node.setPrevious(head);
            head.setNext(node);
        }
        numberOfElements++;
    }
    public Type popFromFront(){
        if(numberOfElements==0){
            System.out.println("List is empty");
            return null;
        }
        DoublyLinkListNode <Type> deleted=head.getNext();
        Type deletedValue=(Type) deleted.getValueOfNode();
        head.getNext().getNext().setPrevious(head);
        head.setNext(head.getNext().getNext());
        deleted=null;
        numberOfElements--;
        return deletedValue;
    }
    public Type popFromEnd(){
        if(numberOfElements==0){
            System.out.println("List is empty");
            return null;
        }
        DoublyLinkListNode <Type> deleted=head.getPrevious();
        Type deletedValue=(Type) deleted.getValueOfNode();
        head.getPrevious().getPrevious().setNext(head);
        head.setPrevious(head.getPrevious().getPrevious());
        deleted=null;
        numberOfElements--;
        return deletedValue;
    }
    public String showList(){
        if(numberOfElements==0){
            System.out.println("List is empty");
            return "List is empty";
        }
        else{
            String res="";
            int iterate=0;
            DoublyLinkListNode current=head.getNext();
            while(iterate<numberOfElements-1){
                System.out.print(current.getValueOfNode()+"=");
                res+=current.getValueOfNode()+"=";
                current=current.getNext();
                iterate++;
            }
            System.out.println(current.getValueOfNode());
            res+=current.getValueOfNode();
            return res;
        }
    }
}
