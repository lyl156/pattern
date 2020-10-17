package CoR;

public class State2Filter implements AbstractFilter{

    @Override
    public void doFilter(ResponsibilityList responsibilityList, FilterChain filterChain) {
        if (responsibilityList.isState2())
            System.out.println("state2 is good");
        filterChain.doFilter(responsibilityList, filterChain);
    }
}
