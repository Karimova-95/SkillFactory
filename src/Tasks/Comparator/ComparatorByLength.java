package Tasks.Comparator;

import java.util.Comparator;

public class ComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String arg0, String arg1) {
        // считаем, что null-ссылки "больше всех"
        // при сортировке они должны уйти в конец
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        // точно две не-null строки -- сравниваем по длине
        return arg0.length() - arg1.length();
    }
}
