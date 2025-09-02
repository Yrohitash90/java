import java.util.Scanner;
public class linkedlist{
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node temp;
        Scanner sc=new Scanner(System.in);
        linkedlist linklist=new linkedlist();
        System.out.print("value of N=");
        int n=sc.nextInt();
        System.out.print("enter val=");
        int a=sc.nextInt();
        linklist.head=new Node(a);
        System.out.print("enter val=");
        a=sc.nextInt();
        linklist.head.next=new Node(a);
        temp=linklist.head.next;
        for(int i=0;i<n-2;i++){
            System.out.print("enter val=");
            a=sc.nextInt();
            temp.next=new Node(a);
            temp=temp.next;
        }
        temp=linklist.head;
        do{
            System.out.println(temp.val);
            temp=temp.next;
        }while(temp.next!=null);
        System.out.println(temp.val);
    }
}