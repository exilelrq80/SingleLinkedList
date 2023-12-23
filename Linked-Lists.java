package linkedlist;
// يتم تعريف كلاس النود وتتكون من متغيرين 
    class Node{
    int data;
    Node next; // type node
// نسوي ميثود تابعه للنود  
  public Node (int x){
    data = x;
    next = null; }
 }
// كلاس اخر يتضمن ال الهيد
    class SingleLinkedList{
        Node head; // creat the head 
        
 // ميثود للطباعة  داخل الميثود تبع الهيد
  public void printList(){
      Node n=head;
      while(n !=null){
          System.out.print(n.data+" ");
          n=n.next;} }
  // اضافه عدد بداية اللسته 
  public void push(int newdata){
        Node N= new Node(newdata);
        N.next=head;
        head=N;
 }
  // اضافة عدد بعد اعداد او بينهم
  public void insertAfter(Node P, int newdata){
      if (P == null){
  System.out.println("The given previous node cannot be null");
          return;  
      }
      Node N=new Node(newdata);
      N.next=P.next;
      P.next=N;
  }
// اضافه عدد نهاية اللنكيد ليست
  public void append(int m){
  Node N=new Node(m);
  if(head==null){
      head=N;
      return;
  }
  N.next=null; // اخر مربع فاضي الربط 
  Node last=head;
  while(last.next!=null){
  last=last.next;
 }
  last.next=N;
  }
  //حذف نود الاول
  public void delete(int key){
  if (head!=null && head.data==key){
  head=head.next;
  return;
  }
  Node tmp=head;
  while(tmp.next!=null){
    if (tmp!=null){
        tmp.next=tmp.next.next;
        return;
    }
    else
        tmp=tmp.next;
  }
  }
    }
      
public class Linkedlist {
    public static void main(String[] args) {
    // تعريف للكلاس
    SingleLinkedList y= new SingleLinkedList();
    y.head = new Node(1); // frist
    Node s2= new Node(2); // secnd
    Node s3= new Node (3); // third
    // هنا ربط الاسهم 
    y.head.next = s2;
    s2.next =s3;
    y.printList(); // print list 
    // اضافه رقم بداية الليست
    y.push(7);
    System.out.println("\n list after add num in start: ");
    y.printList();
    // اضافة عدد بعد كم رقم
    y.insertAfter(s2,0);
    System.out.println("\n list after add num after 3 number: ");
    y.printList();
    // اضافه عدد بالاخير
    y.append(11);
     System.out.println("\n list after add in the end list:");
     y.printList();
     // حذف عنصر الاول
     y.delete(7);
     System.out.println("\n list after delete frist num: ");
     y.printList();
   }
    
}
