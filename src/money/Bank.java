package money;

import java.util.Map;
import java.util.HashMap;

public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();
    private Pair pair = null;

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
         this.pair = new Pair(from, to);
        System.out.println(pair);

        rates.put(pair, rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Pair pair = new Pair(from, to);
        System.out.println(pair);

        return rates.get(this.pair);
    }
}
