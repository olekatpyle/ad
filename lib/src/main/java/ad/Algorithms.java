package ad;

/***
 * Library for different search and sorting algorithms and some general applicable algorithms.
 * ***/
public class Algorithms{
    public boolean someAlgorithmsMethod() {
        return true;
    }

    /***
     * @param n int 
     * @return int fact
     * ***/
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }
    
    /***
     * @apiNote binarySearch for sorted int[]
     * @param searchvalue Integer
     * @param E Array[]<int>
     * @param bot Integer
     * @param top Integer
     * @return index int 
     * ***/
    public static int rec_binarySearch(int searchvalue, int[] E, int bot, int top) {

        // Invariants: searchvalue >= E[i] for all i > bottom
        //             searchvalue <  E[i] for all i < top 
        if (top < bot)
            return top;
        int mid = bot + ((top - bot) / 2);
        if (E[mid] > searchvalue)
            return binarySearch(searchvalue, E, bot, mid-1);
        else
            return binarySearch(searchvalue, E, mid+1, top);
    }

    /***
     * @apiNote binarySearch for sorted int[]
     * @param searchvalue Integer
     * @param E Array[]<int>
     * @value bot Integer
     * @value top Integer
     * @value mid Integer 
     * @return index int 
     * ***/
    public static int it_binarySearch(int searchvalue, int[] E)
    {
        //invarianten: searchvalue >= E[i] for all i > bottom 
        //             searchvalue <  E[i] for all i < top

        int bot = 0;
        int top = E.length - 1;
        int mid = bot + ((top - bot) / 2);

        while(top > bot)
        {
            if( searchvalue < E[mid])
        }
    }
}
