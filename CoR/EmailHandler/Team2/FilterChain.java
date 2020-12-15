import java.util.ArrayList;
import java.util.List;

public class FilterChain implements AbstractFilter {
    private int pos = 0;
    public void setPos(int pos) {
        this.pos = pos;
    }
    private List<AbstractFilter> abstractFilterList = new ArrayList<>();
    @Override
    public void doFilter(AbstractFilter abstractFilter, Email email) {
        abstractFilterList.get(pos++).doFilter(this, email);
    }
    public void addFilter(AbstractFilter abstractFilter) {
        abstractFilterList.add(abstractFilter);
    }
}
