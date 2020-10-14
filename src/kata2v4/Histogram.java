package kata2v4;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
     private final T[] data;
    
    public Histogram(T[] data) {
        this.data = data;
    }
    
    public T[] getData(){
        return data;
    }

    Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        
       for(int i = 0; i<data.length; i++){
       histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i])+ 1 : 1);
       }
       return histogram;
    }
}
