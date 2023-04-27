public class Main {
    public static void main(String[] args) {
        int[] b = {7,3,5,9,11,8,6,15,10,12,14};
        EffSort t = new EffSort(b);
        t.heapSort(); t.display();
        System.out.println();
    }
}

