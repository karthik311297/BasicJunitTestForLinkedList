public class DoublyLinkListNode<Type> {
    private Type valueOfNode;
    private DoublyLinkListNode next;
    private DoublyLinkListNode previous;
    public DoublyLinkListNode(Type value){
        next=null;
        previous =null;
        valueOfNode=value;
    }
    public DoublyLinkListNode(){
        next=this;
        previous =this;
    }

    public Type getValueOfNode() {
        return this.valueOfNode;
    }

    public DoublyLinkListNode getPrevious() {
        return this.previous;
    }

    public DoublyLinkListNode getNext() {
        return this.next;
    }

    public void setValueOfNode(Type valueOfNode) {
        this.valueOfNode = valueOfNode;
    }

    public void setPrevious(DoublyLinkListNode previous) {
        this.previous = previous;
    }

    public void setNext(DoublyLinkListNode next) {
        this.next = next;
    }
}
