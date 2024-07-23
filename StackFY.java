import java.util.Scanner;




public class StackFY {



   

    int top=0;

    int[] stackData;

    StackFY(int n)

    {

        stackData = new int[n];

    }

    void push(int x)

    {   

        int t = isFull();

        if(t==0)

        {

            System.out.println("Stack is Overflow");

        }

        else

        {

            stackData[top]=x;

            top++;

            System.out.println("One Element is Pushed ");

        }

        

    }

    void pop()

    {   

        int t = isEmpty();

        if(t==0)

        {

            System.out.println("Stack is Underflow");

        }

        else

        {

           top--;

            System.out.println("One Element is Poped");

        }

        

    }

    void peek()

    {   

        int t = isEmpty();

        if(t==0)

        {

            System.out.println("Stack is Underflow");

        }

        else

        {

           

            System.out.println("One Element is Peeked "+stackData[top-1]);

        }

        

    }

    void display()

    {

        int t = isEmpty();

        if(t==0)

        {

            System.out.println("Stack is Underflow");

        }

        else

        {

            for(int i=0;i<top;i++)

            {

                System.out.println("Element -> "+stackData[i]);

            }

        }

    }

    int isEmpty()

    {

        if(top==0)

        {

            return 0;

        }

        else

        {

            return 1;

        }

        

    }

    int isFull()

    {

        if(top==5)

        {

            return 0;

        }

        else

        {

            return 1;

        }

    }

    

    public static void main(String[] args) {

       

        

        StackFY sfy = new StackFY(5);

        System.out.println("Welcome to the NUV\n");



        System.out.println("1: Push \n2: Pop \n3: Peek \n4: Display \n5: Exit");      

        while(5==5)

        {

            Scanner obj = new Scanner(System.in);

            System.out.println("Enter Value ");

            int choice = Integer.parseInt(obj.nextLine());

            switch(choice)

            {

                case 1:

                   System.out.println("Enter Value");

                   Scanner obj1 = new Scanner(System.in);

                   int t = Integer.parseInt(obj1.nextLine());

                   sfy.push(t);

                   break;

                case 2:

                    sfy.pop();

                    break;

                case 3:

                    sfy.peek();

                    break;

                case 4:

                    sfy.display();

                    break;

                case 5:

                    System.exit(0);

                default:

                    System.out.println("Invalid Data");

            }

        }

        

        

        

    }

    

}





