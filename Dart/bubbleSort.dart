void main() {
  List<int> arr = [2, 5, 8, 1, 3, 6, 7, 4, 9];
  _bubbleSort(arr);
  print(arr);
}

void _swap(List<int> arr, int indexA, int indexB) {
  int tmp = arr[indexA];
  arr[indexA] = arr[indexB];
  arr[indexB] = tmp;
}

void _bubbleSort(List<int> arr) {
  bool swapped;
  do {
    swapped = false;
    for (var indexA = 0; indexA < arr.length - 1;) {
      var indexB = indexA + 1;
      if (arr[indexA] > arr[indexB]) {
        _swap(arr, indexA, indexB);
        swapped = true;
      }
      indexA = indexB;
    }
  } while (swapped);
}
