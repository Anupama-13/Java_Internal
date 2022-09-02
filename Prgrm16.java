import java.util.*;
class Prgrm16
{
    public static int ip(char sym)
    {
        if(sym=='+' || sym=='-')
           return 1;
        else if(sym=='*'||sym=='/')
           return 3;
        else if(sym=='^')
          return 6;
        else if(sym=='(')
           return 9;
        else if(sym==')')
          return 0;
        else
          return 7;
    }
    public static int sp(char sym)
    {
        if(sym=='+' || sym=='-')
           return 2;
        else if(sym=='*'||sym=='/')
           return 4;
        else if(sym=='^')
          return 5;
        else if(sym=='(')
           return 0;
        else
          return 8;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the infix expression(add ')' and '#'' at end)");
        String infix=sc.next();
        int n=infix.length();
        char pf[]=new char[n];
        Stack st=new Stack(n);
        st.push('(');
        int i=0,j=0;
        char next=infix.charAt(i);
        while(next!='#')
        {
            while(ip(next)<sp(st.s[st.top]))
            {
                char t=st.pop();
                pf[j]=t;
                j=j+1;
            }
            char k;
            if(ip(next)>sp(st.s[st.top]))
               st.push(next);
            else
              k=st.pop();
            i=i+1;
            next=infix.charAt(i);;
        }
        String postfix =new String(pf);
        System.out.println("The postfix expression is..");
        if(st.isEmpty())
        {
            System.out.println(postfix);
        }
        else{
            System.out.println("Invalid expression");
        }
    }
}
class Stack
{
    static int top=-1;
    char s[];
    Stack(int size)
    {
       s=new char[size];
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
   public void push(char elem)
   {
      if(isFull())
         System.out.println("Stack is full");
       else
       {
           top=top+1;
           s[top]=elem;
       }   
   }
   public char pop()
   {
       if(isEmpty())
       {
           System.out.println("Stack is empty");
           return '@';
       }
       else
       {
            char ele=s[top];
            top=top-1;
            return ele;
       }
   }
}