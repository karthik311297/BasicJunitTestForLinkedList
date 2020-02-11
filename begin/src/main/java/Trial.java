public class Trial {
    public static void main(String args[]){
        Myclass <String> listInstance=new Myclass();
        listInstance.popFromEnd();
        listInstance.insertNodeatEnd("karthik");
        listInstance.insertNodeatEnd("iyer");
        listInstance.showList();
        listInstance.insertNodeatEnd("microfocus");
        listInstance.insertNodeatBeginning("MSRIT");
        listInstance.showList();
        listInstance.insertNodeatBeginning("CSE");
        listInstance.showList();
        listInstance.popFromEnd();
        listInstance.popFromFront();
        listInstance.showList();
    }
}
