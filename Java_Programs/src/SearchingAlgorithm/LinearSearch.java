
package SearchingAlgorithm;

import Algorithm.linearSearch;


public class LinearSearch 
{
       public void linearSearch(int ar[]) {
        int count = 0;
        int item = 22;
        int loc=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == item) {
                count++;
                loc=i;
            }

        }
        if ((count > 0)&&(loc>0)) {
            System.out.println("Found.....\t"+loc);
        } else {
            System.out.println("Not Found.....");
        }

    }

    public static void main(String args[]) {
        int ar[] = {3, 1, 5, 4, 2};
        linearSearch ob = new linearSearch();
        ob.linearSearch(ar);

    }
    
}
