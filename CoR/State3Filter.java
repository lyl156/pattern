package CoR;

public class State3Filter implements AbstractFilter{

    @Override
    public void doFilter(ResponsibilityList responsibilityList, FilterChain filterChain) {
        if (responsibilityList.isState3())
            System.out.println("state3 is good");
        filterChain.doFilter(responsibilityList, filterChain);
    }
}
