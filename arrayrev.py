# Array Reversal using recursion.

def revrecur(array,start, end):
    if(start>end):
        print(array) # This is where recursion ends.
    else:
        array[start],array[end] = array[end],array[start] # This is the base case of the recursion.
        revrecur(array,start+1,end-1) # Recursion happening.
    
array = [1,2,3,4,5,6]

revrecur(array,start=0,end=len(array)-1)

# Brackets matching using stack.

def bracketmatch(expr):

    left = '([{'
    right= ')]}'

    stack = []

    for bracket in expr:
        
        if bracket in left:
           
            stack.append(bracket)
        elif bracket in right:
        
            if(len(stack)==0):
                print("Empty Stack.")
                return False

            elif(right.index(bracket)!=left.index(stack.pop())):
                
                print("No Match")
                return False

    # This condition means that, if the index in right doesn't matches with the top most of the stack.
    if(len(stack)==0):
        print("Paranthesis Matched")
    else:
        print("Not matched")


bracketmatch("(")

