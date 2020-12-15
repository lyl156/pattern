public class CEOFilter implements AbstractFilter{
    @Override
    public void doFilter(AbstractFilter filterChain, Email email) {
        if (email.getMyType().equals("FAN")) {
            System.out.println("Forward to CEO.");
            return;
        }
        filterChain.doFilter(filterChain, email);
    }
}
