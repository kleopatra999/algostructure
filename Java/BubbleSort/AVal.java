package BubbleSort;

/**
 *
 * @author kratochb
 */
public class AVal implements Comparable<AVal> {
    private int val;
    
    public AVal(Integer i){
        val = i;
    }

    @Override
	public int compareTo(AVal o) {
        if (o.val == val) {
            return 0;
        } else {
            if (val < o.val) {
                return -1;
            }
        }
        return 1;
    }
}
