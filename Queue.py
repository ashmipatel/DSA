import sys


class QueueDemo:

    front = 0
    rear = 0

    queueData = []

    size = 0



    def _init_(self,size):

        self.size = size



    def isFull(self):

        if(self.rear==self.size):

            return 0

        else:

            return 1

        

    def isEmpty(self):

        if(self.front==0):

            return 0

        else:

            return 1

        

    

    def insert(self,x):

        t = self.isFull()

        

        if(t==0):

            print("Queue is Full")

        else:

            self.queueData.append(x)

            self.rear = self.rear + 1

            print("One Element is Added")

            

    

    def remove(self):

        if((self.rear == 0) or (self.rear == self.front)):

            self.rear  = 0
            self.front = 0
            print("Queue is Empty")

        else:

            self.front = self.front + 1

            print("One Element is Removed")

            







    def display(self):

        if(self.rear == 0):

            print("Queue is Empty")

        else:

            for n in range(self.front,self.rear):

                print("Element -> ",self.queueData[n]) 

            

    



queue1 = QueueDemo(5)

choice = 0

print("Welcome to the NUV\n")

print("1: Insert \n2: Remove \n3: Display \n4: Exit")

while(5==5):

    choice = int(input("Enter Your Choice : "))

    if(choice==1):

        t = input("Enter Value : ")

        queue1.insert(t)

    elif(choice==2):

        queue1.remove()
    elif(choice==3):

        queue1.display()
    
    elif(choice==4):

        sys.exit() 

    else:

        print("Invalid Data")