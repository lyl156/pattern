package CoR;

public class State1Filter implements AbstractFilter{
    @Override
    public void doFilter(ResponsibilityList responsibilityList, FilterChain filterChain) {
        if (responsibilityList.isState1()) {
            System.out.println("state1 is good");
        }
        filterChain.doFilter(responsibilityList, filterChain);
    }
}
