# This is a python representation of Queue
# Assume front and rear as pointers, it will ease the understanding part
class Queue:
    def __init__(self,capacity):
        self.size = 0
        self.front = 0
        self.capacity = capacity
        self.rear = self.capacity-1
        self.que = [None]*self.capacity
    
    def enqueue(self,item):
        # Imageine a mess queue for taking food
        '''
        enqueue adds the element in the back of queue.
        '''
        if(self.size == self.capacity):
            print("Can't enqueue the queue is full")
        else:
            self.rear = (self.rear+1)%self.capacity
            self.que[self.rear] = item
            self.size +=1
            print('Enqueued')
    
    def dequeue(self):
        '''
        Dequeue removes the element (FIFO)
        '''
        if(self.size==0):
            print("Can't dequeue the queue is empty.")
        else:
            self.front = (self.front+1)%self.capacity
            self.size -=1
            print("Dequeued successfully")
        
