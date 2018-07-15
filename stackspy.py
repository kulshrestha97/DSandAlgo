__author__ = "Rajat Kulshreshtha"

class stack():
    def __init__(self,li,mx):
        self.listt = list(li)
        self.max = mx
        self.point = -1
    def top(self):
        if(self.isEmpty()):
            print("Empty Stack")
        else:
            print(self.listt[-1])

    def push(self,num):
        if(len(self.listt)==self.max):
            print("Stack is full")
        else:
            self.listt.append((num))
            self.point+=1

    def pop(self):
        if(self.isEmpty()):
            print("Empty Stack nothing to pop")
        else:
            print("Removing the top element \n")
            self.listt.pop()

    def isEmpty(self):
        return ((len(self.listt)==0))

    def printstack(self):
        print(self.listt)
    
if __name__=="__main__":
    stk = stack([1,2,3,5,4,6],6)
    stk.top()
    stk.pop()
    stk.push(7)
    stk.top()
    stk.printstack()
    stk.isEmpty()
