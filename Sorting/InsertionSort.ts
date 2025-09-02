function insertionSort(arr: number[]) {
    let n = arr.length;
    for(let i = 1; i<n; i++) {
        let key = arr[i];
        let j = i-1
        while(j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key; 
    }
    return arr;
}

let nums = [2,5,3,8,6,1]
console.log(insertionSort(nums));