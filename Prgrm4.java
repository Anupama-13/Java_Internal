import java.util.*;
class Stack
{
    static int top=-1;
    int s[];
    Stack(int size)
    {
       s=new int[size];
    }
    public boolean isEmpty()
   {
        if(top==-1)
           return true;
        else
           return false;
    }
    public boolean isFull()
   { 
       if(top==s.length-1)
          return true;
       else  
          return false;       
   }
   public void push(int elem)
   {
      if(isFull())
         System.out.println("Stack is full");
       else
       {
           top=top+1;
           s[top]=elem;
       }   
   }
   public int pop()
   {
       if(isEmpty())
       {
           System.out.println("Stack is empty");
           return -1;
       }
       else
       {
            int ele=s[top];
            top=top-1;
            return ele;
       }
   }
   public int peek(int s[],int top){
       if(isEmpty())
         return -1;
        else{
            int ele=s[top];
            return ele;
        }
   }
    public void display(){
        for(int i = 0; i<=top;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
   public void disp_rev()
   {
       if(isEmpty())
       {
        System.out.println("Stack is empty");
       }
       else{
              for(int i=top;i>=0;i--)
              {
                    System.out.print(s[i]+" ");
             } 
        }
   }

}
class Prgrm4
{
   public static void main(String args[])
   {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s1.nextInt();
        Stack st=new Stack(n);
        for(int i = 0 ; i<n ;i++)
        {
            int elem = s1.nextInt();
            st.push(elem);
        }
        System.out.println("Stack elements are..");
        st.display();
        System.out.println("Stack elements in reverse order are..");
        st.disp_rev();
        int d=st.pop();
        System.out.println("Deleting  element"+ d);
        System.out.println(" after deletion Stack elements are..");
        st.disp_rev();
   }

}