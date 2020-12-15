public class SpamBoxFilter implements AbstractFilter{
    @Override
    public void doFilter(AbstractFilter filterChain, Email email) {
        if (email.getMyType().equals("SPAM")) {
            System.out.println("Put mail to the spam box.");
            return;
        }
        filterChain.doFilter(filterChain, email);
    }
}
