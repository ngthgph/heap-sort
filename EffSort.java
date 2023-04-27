public class EffSort {
    int[] a; int n;

    EffSort() {}
    EffSort(int[] b) {
        n = b.length;
        a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = b[i];
    }

    void display() {
        for(int i = 0; i<n; i++)
            System.out.print(" " + a[i]);
        System.out.println();
    }

    void heapify(int length, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < length && a[left] > a[largest])
            largest = left;

        if(right < length && a[right] > a[largest])
            largest = right;

        if(largest != i) {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;

            heapify(length, largest);
        }
    }

    /*Sap xep bang HEAP: Heap la cay nhi phan gan day duoc cai dat bang
    mang mot chieu voi cac nut tren heap co noi dung nho hon nut goc
    va cac nhanh cay con cung la cac heap*/
    void heapSort() {
        for(int i = n/2-1; i >= 0; i--)
            heapify(n, i);

        for(int i = n-1; i>0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(i, 0);
        }
    }
}
