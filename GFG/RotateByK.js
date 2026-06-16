let a = [1,2,3,4,5]
a = a.reverse()
let k = 2;
let mode = "left";
function reverseAt(start, end, arr) {
    while(start<end) {
        [arr[start], arr[end]] = [arr[end], arr[start]];
        start++;
        end--;
    }
    return arr;

}
if(mode === 'left') {
    a= reverseAt(0,k-1,a);
    a=reverseAt(k,a.length-1,a)
}
console.log(a);

function floorSqrt(n) {
        // code here
        let i;
        for(i = 1; i<=Math.floor(n/2);i++) {
            if(i**2 === n) return i;
            if(i**2 > n) break;
        }
        return i-1;
    }

let x = floorSqrt(5)
console.log(x)