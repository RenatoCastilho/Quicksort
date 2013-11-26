package quicksort;
public class Quicksort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 6, 1, 4, 8};
        Sort sort = new Sort();
        sort.quicksort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
    }
}
