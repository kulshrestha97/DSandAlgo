function linearSearch(arr: number[], target: number) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == target) return i;
  }
  return -1;
}
let array = [5, 7, 8, 2, 3];
let target = 3;
linearSearch(array, target);
