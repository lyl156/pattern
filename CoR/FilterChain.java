package CoR;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements AbstractFilter {
    private int pos = 0;
    private Handler handler;
    private List<AbstractFilter> abstractFilterList;

    public FilterChain(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void doFilter(ResponsibilityList responsibilityList, FilterChain filterChain) {
        if (pos == abstractFilterList.size()) {
            handler.handle();
            return;
        }
        abstractFilterList.get(pos++).doFilter(responsibilityList, filterChain);
    }

    public void addFilter(AbstractFilter abstractFilter) {
        if (abstractFilterList == null)
            abstractFilterList = new ArrayList<>();
        abstractFilterList.add(abstractFilter);
    }

}
