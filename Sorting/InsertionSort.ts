/**
 * Insertion sort also works in dividing the array into unsorted and sorted halves.
 * However, we don't use swapping strategy in insertion sort, we literally pluck the number
 * and shift the remaining elements and put it at the desired place. 
 */
function insertionSort(arr: number[]) {
    let n = arr.length;
    for(let i = 1; i<n; i++) { // reason for starting from 1 is, we assume the first element is in sorted half.
        let key = arr[i]; // making ith element as the key
        let j = i-1 // we do backward while loop on the sorted half and check whether the element is bigger than key.
        while(j>=0 && arr[j]>key) {
            arr[j+1] = arr[j]; // if it is, we simply shift the element to the next place.
            j--; // decrease the index of the sorted side.
        }
        arr[j+1] = key; // place the key at the displaced element's place.
    }
    return arr;
}

// check DSA copy
let nums = [2,5,3,8,6,1]
console.log(insertionSort(nums));