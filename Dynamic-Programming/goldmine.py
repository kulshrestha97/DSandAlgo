def goldminedp(mining,rows,cols):
    # Always remember in these type of problems take a 2D Array of size n and m
    dp = [[0 for i in range(cols)] for i in range(rows)]
    for col in range(cols-1,-1,-1):
        for row in range(rows):
            if(row==0 or col==cols-1):
                rightup = 0
            else:
                rightup = dp[row-1][col+1]
            if(row==rows-1 or col==cols-1):
                rightdown = 0
            else:
                rightdown = dp[row+1][col+1]
            if(col==cols-1):
                right = 0
            else:
                right = dp[row][col+1]
            dp[row][col]=mining[row][col]+max(right,rightdown,rightup)
    print(dp)
    res = dp[0][0]
    for i in range(1,cols):
        res = max(res,dp[i][0])
    print(res)
            




if __name__=="__main__":
    mapmining = [[1,3,1,5],[2,2,4,1],[5,0,2,3],[0,6,1,2]]
    rows = 4
    cols = 4
    goldminedp(mapmining,rows,cols)