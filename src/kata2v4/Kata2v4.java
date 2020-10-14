package kata2v4;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Juanjo
 */
public class Kata2v4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 12, 12};
       
       Histogram meta_histogram = new Histogram(data);
        
       Map<Integer, Integer> histogram;
       histogram = meta_histogram.getHistogram();
        
       Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
       while (entries.hasNext()){
           Map.Entry<Integer, Integer> entry = entries.next();
           System.out.println("key = "+ entry.getKey() + " value = "+ entry.getValue());
       }
        
    }
    
}
