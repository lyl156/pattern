package CoR;

public class test {
    public static void main(String[] args) {
        ResponsibilityList responsibilityList = new ResponsibilityList();
        responsibilityList.setState1(true);
        responsibilityList.setState2(false);
        responsibilityList.setState3(true);

        //do all filter, and finally handle the request
        FilterChain filterChain = new FilterChain(new Handler());
        AbstractFilter state1Filter = new State1Filter();
        AbstractFilter state2Filter = new State2Filter();
        AbstractFilter state3Filter = new State3Filter();
        filterChain.addFilter(state1Filter);
        filterChain.addFilter(state2Filter);
        filterChain.addFilter(state3Filter);

        filterChain.doFilter(responsibilityList, filterChain);

    }

}
