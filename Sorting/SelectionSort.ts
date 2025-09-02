/**
 * Selection sorts works on dividing array into sorted and unsorted parts.
 * Starting point it contains the first element as sorted.
 * and loops over the remaining elements to find local minimum each time.
 * and then after it finds the minimum element, it swaps the min element with the key. 
 */
function selectionSort(arr: number[]) {
    let n = arr.length;
    for(let i = 0; i<n-1;i++) {
        let minIndex = i; // start with the first element as sorted.
        for(let j = i+1; j<n;j++) {
            if(arr[j]<arr[minIndex]) {
                minIndex = j; // find local minimum
            }
        }
        [arr[i],arr[minIndex]] = [arr[minIndex], arr[i]]; // swap
    }
    return arr;
}
let nums = [3,5,2,4,1]
console.log(selectionSort(nums))

export {}