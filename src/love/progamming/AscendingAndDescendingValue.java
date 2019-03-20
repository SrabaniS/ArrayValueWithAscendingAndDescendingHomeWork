package love.progamming;

public class AscendingAndDescendingValue {

    public static void main(String[] args) {
        int[]a={3,4,6,8,9,10};
       int abc;
        for( int i=0; i< a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >a[j]) {
                    abc = a[i];
                    a[i] = a[j];
                    a[j] = abc;


                }
            }
            System.out.println("Ascendingorder   " + a[i]);







        }}}