/**
 * Goal of bubble sort is to always put the ith largest element of the iteration to the end
 * (end as in the index it should belong to, like largest should be at the last,
 * second largest should be second last like that)
 *
 */
function bubbleSort(arr: number[]) {
  let n = arr.length;
  if(!arr) return;
  for (let i = 0; i < n; i++) {
    // check in the DSA copy for the dry run,
    // the formula that comes out for number of comparisons is j = n-1-i
    for (let j = 0; j < n - i; j++) {
      if (arr[j + 1] < arr[j]) {
        [arr[j + 1], arr[j]] = [arr[j], arr[j + 1]];
      }
    }
  }
  return arr;
}

let nums = [3, 4, 5, 1, 2, 6];
console.log(bubbleSort(nums));

export {}