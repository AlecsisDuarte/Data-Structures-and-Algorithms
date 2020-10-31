class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,1,5,6,8,4,9,7};
        bubbleSort(arr);
        printArray(arr);
    }

    private static void swap(final int[] arr, final int indexA, final int indexB) {
        final int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    private static void bubbleSort(final int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int indexA = 0; indexA < arr.length - 1;) {
                final int indexB = indexA + 1;
                if (arr[indexA] > arr[indexB]) {
                    swap(arr, indexA, indexB);
                    swapped = true;
                }
                indexA = indexB;
            }
        } while(swapped);
    }

    private static void printArray(final int[] arr) {
        StringBuilder sBuilder = new StringBuilder("[");
        for (int index = 0; index < arr.length; index++) {
            sBuilder.append(arr[index]);
            if (index < arr.length - 1) {
                sBuilder.append(", ");
            }
        }
        sBuilder.append("]");
        System.out.println(sBuilder.toString());
    }
}