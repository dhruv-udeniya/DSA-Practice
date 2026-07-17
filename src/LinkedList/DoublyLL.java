//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node prev;
//    Node next;
//
//    public Node(int data, Node prev, Node next) {
//        this.data = data;
//        this.prev = prev;
//        this.next = next;
//    }
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//
//
//public class DoublyLL {
//
//    int len;
//    Node head;
//
//
//    public void deleteKth(int ind){
//        if (ind < 1 || ind > len){
//            System.out.println("please enter valid index");
//            return;
//        }
//
//        if (ind == 1){
//            deletHead();
//            return;
//        }
//        if (ind == len){
//            deleteTail();
//            return;
//        }
//
//        Node mover = head;
//        int cnt = 1;
//        while(cnt < ind && mover != null){
//            mover = mover.next;
//            cnt++;
//        }
//        // mover is now the node to delete]
//        mover.prev.next = mover.next;
//        mover.next.prev = mover.prev;
//    }
//
//
//    public void deleteTail(){
//        if (head == null || head.next == null){
//            head = null;
//            return;
//        }
//        Node mover = head;
//        while(mover.next.next != null){
//            mover = mover.next;
//        }
//        mover.next.prev = null;
//        mover.next = null;
//    }
//
//
//    public void deletHead(){
//
//        if (head == null || head.next == null){
//            head = null;
//            return;
//        }
//        Node mover = head;
//        head = mover.next;
//        head.prev = null;
//    }
//
//
//    public void insertKth(int data , int ind){
//
//        if(ind < 1 || ind > len+1){
//            System.out.println("Pleasse enter valid index..");
//            return;
//        }
//
//        if(ind == 1){
//            insertHead(data);
//            return;
//        }
//        if(ind == len+1){
//            insertail(data);
//            return;
//        }
//
//        Node mover = head;
//        int cnt = 1;
//
//        while (cnt<ind-1 && mover != null){
//            mover = mover.next;
//            cnt++;
//        }
//        Node newNode = new Node(data,mover,mover.next);
//        mover.next.prev = newNode;
//        mover.next = newNode;
//    }
//
//
//    public void insertail(int data){
//        Node mover = head;
//        if (head == null){
//            head = new Node(data, null , null);
//            return;
//        }
//
//        while(mover.next != null){
//            mover = mover.next;
//        }
//        Node newNode = new Node(data,mover,null);
//        mover.next = newNode;
//    }
//
//
//    public void insertHead(int data){
//        if (head == null){
//            head = new Node(data , null , null);
//            return;
//        }
//        Node mover = head;
//        Node newNode = new Node(data , null , mover);
//        head.prev = newNode;
//        head = newNode;
//    }
//
//
//    public void traverse(){
//        if (head == null){
//            System.out.println("List is empty..");
//            return;
//        }
//        Node mover = head;
//        System.out.print("null<-->");
//        while(mover != null){
//            System.out.print(mover.data+"<-->");
//            mover = mover.next;
//        }
//        System.out.println("null");
//    }
//
//    public void buildList(int arr[]){
//        head = new Node(arr[0],null,null);
//        Node mover = head;
//
//        for(int i = 1 ; i<arr.length ; i++){
//            Node temp = new Node(arr[i],mover,null);
//            mover.next = temp;
//            mover = temp;
//        }
//        this.len = arr.length;
//    }
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of Nodes-:");
//        int nodes = sc.nextInt();
//
//
//        if(nodes<1) {
//            System.out.println("Please enter valid nodes no..");
//            return;
//        }
//
//
//        System.out.println("Enter the data of nodes-:");
//        int arr[] = new int[nodes];
//        for(int i = 0 ; i<arr.length ; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        DoublyLL dl = new DoublyLL();
//
//        dl.buildList(arr);
//        dl.traverse();
//
//        dl.deleteKth(3);
//        dl.traverse();
//    }
//}
