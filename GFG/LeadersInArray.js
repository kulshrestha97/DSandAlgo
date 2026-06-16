class Solution {
    // Function to find the leaders in the array.
    leaders(a) {
        // code here
        let x = a.length - 1;
        let leader = a[x];
        let result = [leader]
        for(let i = x-1; i>=0;i--) {
            if(a[i]>=leader) {
                leader = a[i]
                result.push(a[i])
            }
        }
        return result.reverse();
    }
}