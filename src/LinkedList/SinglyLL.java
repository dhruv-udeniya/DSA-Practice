//import java.util.Scanner;
//import java.util.Stack;
//
//class Node{
//   int data;
//   Node next;
//
//   Node(int data , Node next){
//       this.data = data;
//       this.next = next;
//   }
//
//   Node(int data){
//       this.data = data;
//   }
//}
//
//public class SinglyLL {
//
//   Node head;
//   int len;
//
//   SinglyLL(int len){
//       this.len = len;
//   }
//
//
//   public void reverse(){
//       Node temp = head;
//       Node prev = null;
//
//       while(temp != null){
//           Node front = temp.next;
//           temp.next = prev;
//           prev = temp;
//           temp = front;
//       }
//       head = prev;
//   }
//
//   public void reverse(){
//       Node mover = head;
//       Stack<Integer> st = new Stack<>();
//       while(mover != null){
//           st.add(mover.data);
//           mover = mover.next;
//       }
//       mover = head;
//       while (mover != null){
//           mover.data = st.pop();
//           mover = mover.next;
//       }
//   }
//
//   public void insertHead(int data){
//       Node mover = head;
//       Node newhead = new Node(data,mover);
//       head = newhead;
//   }
//
//   public void inserttail(int data){
//       if (head == null){
//           head = new Node(data,null);
//           return;
//       }
//       Node mover = head;
//       Node newnode = new Node(data,null);
//       while (mover.next != null){
//           mover = mover.next;
//       }
//       mover.next = newnode;
//   }
//
//
//   public void insertkth(int data , int ind){
//       Node mover = head;
//       if (ind<1 || ind>len+1){
//           System.out.println("Enter valid index.. ");
//           return;
//       }
//
//       if (ind == 1){
//           insertHead(data);
//           return;
//       }
//
//       int cnt = 1;
//       while(cnt<ind-1 && mover != null){
//           mover = mover.next;
//           cnt++;
//       }
//       Node newnode = new Node(data);
//       newnode.next = mover.next;
//       mover.next = newnode;
//   }
//
//
//   public void Deletehead(){
//
//       if (head == null || head.next == null){
//           head = null;
//           return;
//       }
//
//       Node mover = head;
//       head = mover.next;
//       return;
//   }
//
//
//
//   public void DeleteTail(){
//       Node mover = head;
//
//       if (head == null || head.next == null){
//           head = null;
//           return;
//       }
//
//       while(mover.next.next != null){
//           mover = mover.next;
//       }
//       mover.next = null;
//   }
//
//
//
//   public void DeleteKth(int ind){
//       if (ind < 1 || ind >= len+1){
//           System.out.println("Enter valid index..");
//           return;
//       }
//
//       if (ind == 1){
//           Deletehead();
//           return;
//       }
//       if (ind == len){
//           DeleteTail();
//           return;
//       }
//
//       int cnt = 1;
//       Node mover = head;
//
//       while(cnt<ind-1 && mover != null){
//           mover = mover.next;
//           cnt++;
//       }
//       mover.next = mover.next.next;
//   }
//
//
//
//   public void traverse(){
//       Node mover = head;
//
//       if (head == null){
//           System.out.println("List is empty..");
//           return;
//       }
//
//       while (mover != null){
//           System.out.print(mover.data+"-->");
//           mover = mover.next;
//       }
//       System.out.println("nulll");
//   }
//
//
//   public void Buildlist(int arr[]){
//       head = new Node(arr[0]);
//       Node mover = head;
//       for(int i = 1 ; i< arr.length ; i++){
//           Node temp = new Node(arr[i],null);
//           mover.next = temp;
//           mover = mover.next;
//       }
//   }
//
//   public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter no of nodes-:");
//       int nodes = sc.nextInt();
//
//       if (nodes<=0){
//           System.out.println("Enter valid nodes no..");
//           return;
//       }
//
//       System.out.println("Enter data of nodes-:");
//       int arr[] = new int[nodes];
//
//       for(int i = 0 ; i<nodes ; i++){
//           arr[i] = sc.nextInt();
//       }
//
//       SinglyLL l1 = new SinglyLL(nodes);
//
//       l1.Buildlist(arr);
//       l1.traverse();
//
//
//       l1.reverse();
//       l1.traverse();
//   }
//
//}
