
package SearchingAlgorithm;


public class BinarySearch 
{
    
    public int binarySearchTest(int ar[], int key) {
        int beg = 0;
        int end = ar.length - 1;
        while (beg <= end) {

            int mid = (beg + end) / 2;
            if (key == ar[mid]) {
                return mid;
            } else if (key < ar[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int ar[] = {1, 3, 5, 6, 8};

        Algorithm.BinarySearch ob = new Algorithm.BinarySearch();
        System.out.println(ob.binarySearchTest(ar, 6));

    }
}
