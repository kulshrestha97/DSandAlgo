let arr = [1, 2, 3, 4, 6];

function binarySearch(arr: number[], target: number) {
  let l = 0;
  let r = arr.length - 1;
  while (r >= l) {
    let m = Math.floor((l + r) / 2);
    if (arr[m] === target) return m;
    else if (arr[m] < target) {
      r = m - 1;
    } else {
      l = m + 1;
    }
  }
  return -1;
}

binarySearch(arr, 4);
