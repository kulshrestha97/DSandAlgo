# This is a representation of LinkedList Data Structure
class Node:
    """
    This Class represents a single node of linked list
    Fields and Behaviors -- OOPS concept
    """
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    """
    This class represents the linkedlist, as it is accessed by its head.
    All the functionalities of LinkedList will be defined in this class
    """
    def __init__(self):
        self.head = None

    def printlist(self):
    
        temp = self.head
        listprint = ""
        while(temp):
            listprint+=str(temp.data)
            temp = temp.next
        return listprint

    def delete(self, key):
        temp = self.head
        '''
        If the node to delete is the first node in the list
        '''
        if(temp is not None):
            if(temp.data == key):
                self.head = temp.next
                temp = None

        while(temp is not None):
            if(temp.data == key):
                break

            prev = temp
            temp = temp.next
        prev.next = temp.next
        temp = None

    def reverse(self):
        '''
        We have to keep the record of the previous node also, 
        Plus we have to keep the linked list's head at the previous, because
        after the function occurs, previous will point to the last node.
        '''
        temp = self.head 
        prev = None
        while(temp is not None):
            next1 = temp.next # Point to the next node
            temp.next = prev # Think of it as the first node.
            prev = temp # prev holds the value of current node.
            temp = next1 # temp is now holding the value of the next node.
        self.head = prev # this is necessary for printing out the LinkedList in reverse order.

    def search(self,x):
        
        temp = self.head
        count = 0
        while(temp is not None):
            
            if(temp.data == x):
                print("Found at: ", count)
            
            count+=1
            temp = temp.next

    def retrieve(self, index):
        temp = self.head
        count=0
        while(temp!=None):
            if(count==index):
                print("The data at the given index is: ",temp.data)
                break
            temp = temp.next
            count+=1

    def length(self):
        temp = self.head
        count=0
        while(temp is not None):
            count+=1
            temp = temp.next
        return count

    def swap(self,x,y):
        xprev = None
        xcurr = self.head
        while(xcurr!= None and xcurr.data !=x):
            xprev.next = xcurr
            xcurr = xcurr.next
        yprev = None
        ycurr = self.head
        while(ycurr!=None and ycurr.data !=y):
            yprev.next = ycurr
            ycurr = ycurr.next
        if(xcurr.data == x and ycurr.data ==y):
            temp = xcurr.next
            xcurr.next = ycurr.next
            ycurr.next = temp
    
    def middle(self):
        l = self.length()
        temp = self.head
        if(l%2!=0):
            toprint = (l+1)/2
        else:
            toprint = (l/2)+1
        
        count = 1
        while(temp!=None):
            if(count==toprint):
                print("The middle of this list is: ",temp.data)
            
            temp = temp.next
            count+=1
    
    def instance(self,num):
        temp = self.head
        count = 0
        while(temp!=None):
            if(temp.data == num):
                count+=1
            temp = temp.next

        print("The given number appears %d times in LinkedList" % count)

    def palindrome(self):
        s1 = self.printlist()
        self.reverse()
        s2 = self.printlist()

        if(s1==s2):
            print("Palindrome")
        else:
            print("No its not")

    def detectloop(self):
        temp = self.head 
        s = set() # LOGIC for making distinct entries in the list, set's basic property.
        while (temp is not None):
            if(temp in s): 
                return True
            s.add(temp) 
    
    def lasttofirst(self):
        temp = self.head
        temp1 = self.head
        prev = None 
        while(temp.next is not None):
            prev = temp
            next1 = temp.next
            
            next1.next = temp1
            prev.next = None

    def printalt(self):
        temp = self.head
        count = 0
        while(temp is not None):
            if(count%2==0):
                print(temp.data)
            count+=1    
            temp = temp.next
            
            

if __name__=="__main__":
    # TODO: First creates nodes then add lists 
    llist = LinkedList()
    
    llist.head = Node("1")
    second = Node("2")
    third = Node("3")
    fourth = Node("4")
    fifth = Node("5")


    

    llist.head.next = second
    second.next = third
    third.next = fourth
    fourth.next = fifth
    fifth.next = None
    
    llist.printalt()
    
'''

    Now next of second Node refers to third.  So all three
    nodes are linked.
 
    llist.head        second              third
         |                |                  |
         |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  |  o-------->|  3 | null |
    +----+------+     +----+------+     +----+------+

'''